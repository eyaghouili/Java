public class Employe implements Comparable<Employe>{
    private int id,grade;
    private String nom,prenom,nom_depart;

    public Employe(int id, int grade, String nom, String prenom, String nom_depart) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_depart = nom_depart;
    }

    public Employe() {
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

    public String getNom_depart() {
        return nom_depart;
    }

    public void setNom_depart(String nom_depart) {
        this.nom_depart = nom_depart;
    }
    public boolean equals(Object obj)
    {
        if(this==obj)return true;
        if(this==null)return false;
        if(this.getClass()==obj.getClass())
        {
            Employe e=(Employe)obj;
            return( this.id==e.id && this.nom.equals(e.nom));
        }
        return false;
    }
    public String toString()
    {
        return "id:"+id+"nom:"+nom+"prenom:"+prenom+
                "nom departement:"+nom_depart+
                "grade:"+grade;
    }

    @Override
    public int compareTo(Employe o) {
        return this.nom.compareTo(o.nom);
    }
}
