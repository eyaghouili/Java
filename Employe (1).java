public class Employe implements Comparable<Employe>{
    private int id,grade;
    private String nom,prenom,nomDep;


    public Employe(int id, int grade, String nom, String prenom, String nomDep) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Employe em=(Employe) obj;
        if(em.id==id && em.nom.equals(nom))
            return true;
        return false;
    }

    @Override
    public int compareTo(Employe o) {
        return this.id-o.id;
    }
}
