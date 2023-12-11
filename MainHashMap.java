import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        Employe e1 = new Employe(1, 1,"Chouk","Eya","KKK");
        Employe e2 = new Employe(2, 7,"Assas","Assil","ppppp");
        Employe e3 = new Employe(3, 8,"Chouk","Kenza","hello");


        Departement d1 = new Departement(1,10,"ppppp");
        Departement d2 = new Departement(2,15,"KKK");
        Departement d3 = new Departement(3,20,"hello");

        affectationMap.ajouterEmployeDepartement(e1, d1);
        affectationMap.ajouterEmployeDepartement(e2, d2);
        affectationMap.ajouterEmployeDepartement(e3, d1);

        System.out.println("Affichage initial :");
        affectationMap.afficherEmployesEtDepartements();
        System.out.println("Test ajout de l'employe e1 deux fois");
        affectationMap.ajouterEmployeDepartement(e1, d2);


        System.out.println("\nAffichage après ajout du même employé dans deux départements :");
        affectationMap.afficherEmployesEtDepartements();


        affectationMap.supprimerEmploye(e2);
        affectationMap.supprimerEmployeEtDepartement(e3, d1);

        System.out.println("\nAffichage après suppression d'employés et départements :");
        affectationMap.afficherEmployesEtDepartements();

        System.out.println("\nListe des employés :");
        affectationMap.afficherEmployes();

        System.out.println("\nListe des départements :");
        affectationMap.afficherDepartements();

        System.out.println("\nRechercher employé John : " + affectationMap.rechercherEmploye(e1));
        System.out.println("Rechercher département Informatique : " + affectationMap.rechercherDepartement(d2));

        System.out.println("\nTri des employés par identifiant :");
        TreeMap<Employe, Departement> employesTries = affectationMap.trierMap();
        for (Map.Entry<Employe, Departement> entry : employesTries.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
        }
    }
}
