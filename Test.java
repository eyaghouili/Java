public class Test {
    public static void main(String[] args) {

        SocieteArrayList soc=new SocieteArrayList();

        Employe em1=new Employe(1,2,"nom1","prenom1","info");
        Employe em2=new Employe(1,2,"nom1","prenom1","info");
        Employe em3=new Employe(2,3,"nom2","prenom2","info");
        Employe em4=new Employe(3,5,"nom3","prenom2","info");
        Employe em5=new Employe(3,5,"nom3","prenom2","info");


        soc.ajouterEmploye(em1);
        soc.ajouterEmploye(em3);
        soc.ajouterEmploye(em4);
        soc.ajouterEmploye(em5);

        soc.displayEmploye();

        System.out.println(soc.rechercherEmploye(em2));
        System.out.println(soc.supprimerEmploye(em2));
        System.out.println(soc.rechercherEmploye(em1));

   //test Departement
        GestionDepartement ges=new GestionDepartement();
        Departement dep1=new Departement(1,15,"info");
        Departement dep2=new Departement(2,20,"telecom");
        Departement dep3=new Departement(3,12,"mobile");
        Departement dep4=new Departement(3,12,"mobile");

       ges.ajouterDepartement(dep1);
        ges.ajouterDepartement(dep2);
        ges.ajouterDepartement(dep3);
        ges.ajouterDepartement(dep4);
        ges.ajouterDepartement(dep1);
        System.out.println("Affichage Departement");

        ges.displayDepartement();

        ges.trierDepartementById();

    }
}
