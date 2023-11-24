import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;

    public SetMedecins() {
        setM = new HashSet<>();
    }

    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }

    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(medecin -> medecin.getCin() == cin);
    }

    public void afficherMedecins() {
        setM.forEach(System.out::println);
    }

    public long nombreMedecins() {
        return setM.size();
    }

    public TreeSet<Medecin> trierMedecins() {
        return setM.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>((m1, m2) -> {
                    // Compare medecins based on their names
                    int compareNom = m1.getNom().compareTo(m2.getNom());
                    if (compareNom != 0) {
                        return compareNom;
                    }
                    // If names are the same, compare based on their numbers
                    return Integer.compare(m1.getNumOrdre(), m2.getNumOrdre());
                })));
    }
}
