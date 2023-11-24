import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new TreeMap<>((m1, m2) -> Integer.compare(m1.getCin(), m2.getCin()));
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            ListPatients listPatients = medecinPatients.get(m);
            listPatients.ajouterPatient(p);
        } else {
            // Handle the case where the Medecin is not in the TreeMap
            // You might want to throw an exception or handle it according to your requirements
        }
    }

    // Avec l'API Stream
    public void afficherMap() {
        medecinPatients.forEach((medecin, listPatients) ->
                System.out.println("Medecin: " + medecin + ", Patients: " + listPatients));
    }

    // Afficher les patients d'un medecin dont le nom est "mohamed"
    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            ListPatients listPatients = medecinPatients.get(m);
            listPatients.afficherPatients();
        } else {
            System.out.println("Le médecin n'est pas présent dans l'hôpital.");
        }
    }
}
