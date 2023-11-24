import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id,nb_employes;
    private String nom_departement;

    public Departement(int id, int nb_employes, String nom_departement) {
        this.id = id;
        this.nb_employes = nb_employes;
        this.nom_departement = nom_departement;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNb_employes() {
        return nb_employes;
    }

    public void setNb_employes(int nb_employes) {
        this.nb_employes = nb_employes;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId() && getNb_employes() == that.getNb_employes() && this.getNom_departement().equals(that.getNom_departement());
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(getId(), getNb_employes(), getNom_departement());
    }*/

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nb_employes=" + nb_employes +
                ", nom_departement='" + nom_departement + '\'' +
                '}';
    }
    public int compareTo(Departement autreDepartement) {
        return Integer.compare(this.id, autreDepartement.id);
    }
}
