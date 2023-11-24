import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class DepartementHashSet implements IDepartement<Departement>{
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements) {
            if (departement.getNom_departement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departements) {
            System.out.println(departement.toString());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }
}
