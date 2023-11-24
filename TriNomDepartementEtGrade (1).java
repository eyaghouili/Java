import java.util.Comparator;

public class TriNomDepartementEtGrade implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        int compareNomDepartement=o1.getNom_depart().compareTo(o2.getNom_depart());
        if(compareNomDepartement==0)
            return Integer.compare(o1.getGrade(),o2.getGrade());
        return compareNomDepartement;
    }
}
