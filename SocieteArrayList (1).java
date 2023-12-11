import java.util.ArrayList;
import java.util.Collections;

public class SocieteArrayList implements IGestion<Employe>{

    private ArrayList<Employe> list=new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
       for (int i=0;i<list.size();i++)
       {
           if(list.get(i).getNom().equals(nom))
               return true;
       }

       return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return list.contains(employe);//redefinition equals
    }

    @Override
    public boolean supprimerEmploye(Employe employe) {
      return list.remove(employe);//redefinition equals
    }

    @Override
    public void displayEmploye() {
     for (int i=0;i<list.size();i++)
     {
         System.out.println(list.get(i));
     }
        //for (Employe e:list)
          //  System.out.println(e);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
