import java.util.Comparator;

public class TriNomEtDep implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
       if (o1.getGrade()==o2.getGrade())
        return o1.getNomDep().compareTo(o2.getNomDep());
       return o1.getNomDep().compareTo(o2.getNomDep());
    }
}
