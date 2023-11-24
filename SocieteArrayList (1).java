import java.lang.reflect.Array;
import java.util.*;

public class SocieteArrayList implements IGestion<Employe>{

    List<Employe> listeEmploye;

    SocieteArrayList()
    {
        listeEmploye=new ArrayList<>();
    }
    public List<Employe> getListeEmploye() {
        return listeEmploye;
    }

    public void setListeEmploye(List<Employe> listeEmploye) {
        this.listeEmploye = listeEmploye;
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmploye.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe e:listeEmploye)
        {
            if(e.getNom()==nom)
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        for(Employe e:listeEmploye)
        {
            if(e==employe)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if (rechercherEmploye(employe))
        {
            listeEmploye.remove(employe);
        }

    }






    @Override
    public void displayEmploye() {
        for(Employe e:listeEmploye)
        {
            System.out.println(e);
        }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmploye);

    }


    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmploye, new TriNomDepartementEtGrade());
    }
}
