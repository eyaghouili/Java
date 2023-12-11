import java.util.HashMap;
import java.util.*;


public class AffectationHashMap {
    private Map<Employe,Departement> mapDepartementEmploye;
    AffectationHashMap()
    {
        mapDepartementEmploye=new HashMap<>();
    }
    public boolean ajouterEmployeDepartement(Employe e, Departement d)
    {
        if(!mapDepartementEmploye.containsKey(e)) {
            mapDepartementEmploye.put(e,d);
            return true;
        }return false;
    }
    public void afficherEmployesEtDepartements()
    {
        for (Map.Entry<Employe, Departement> entry : mapDepartementEmploye.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au département " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employe e) {
        // Instruction 4
        mapDepartementEmploye.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        // Instruction 5
        mapDepartementEmploye.remove(e, d);
    }
    public void afficherEmployes() {
        // Instruction 6
        for (Employe e : mapDepartementEmploye.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        // Instruction 7
        for (Departement d : mapDepartementEmploye.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        // Instruction 8
        return mapDepartementEmploye.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        // Instruction 9
        return mapDepartementEmploye.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        // Instruction 10
        return new TreeMap<>(mapDepartementEmploye);
    }


}
