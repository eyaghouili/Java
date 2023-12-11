import java.util.Comparator;

public class Departement implements Comparable<Departement> {
    private int id,nbEmp;
    private String nom;

    public Departement(int id, int nbEmp, String nom) {
        this.id = id;
        this.nbEmp = nbEmp;
        this.nom = nom;
    }
   public Departement(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbEmp=" + nbEmp +
                ", nom='" + nom + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return id+nom.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)return true;
        if (obj==null)return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Departement de=(Departement) obj;
        if(de.nom.equals(nom) &&de.id==id)
            return true;
        return false;
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
