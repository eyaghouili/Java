import java.util.HashSet;
import java.util.TreeSet;

public class GestionDepartement implements IDepartement<Departement>
{
    private HashSet<Departement> hash=new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        hash.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep:hash)
        {
            if(dep.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return hash.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        System.out.println(hash.remove(departement));
    }

    @Override
    public void displayDepartement() {

        for(Departement dep:hash)
            System.out.println(dep);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
       TreeSet<Departement> tre=new TreeSet<>();//Comparable
       tre.addAll(hash);
       return tre;

    }
}
