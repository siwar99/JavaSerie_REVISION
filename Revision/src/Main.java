// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hopital hopital = new Hopital();

        Medecin medecin1 = new Medecin(123, "Douaa", "Salima", 456);
        Medecin medecin2 = new Medecin(456, "Fendri", "Aziz", 789);

        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        Patient patient1 = new Patient(111, "Siwar", "Zouita", 12345);
        Patient patient2 = new Patient(222, "Nabil", "Zouita", 67890);
        Patient patient3 = new Patient(333, "Ons", "Jabeur", 12345);

        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.ajouterPatient(medecin2, patient3);

        // Displaying the hospital map
        System.out.println("Hospital Map:");
        hopital.afficherMap();

        // Displaying patients of a specific Medecin
        System.out.println("\nPatients of Medecin " + medecin1.getNom() + ":");
        hopital.afficherMedcinPatients(medecin1);
        System.out.println("\nPatients of Medecin " + medecin2.getNom() + ":");
        hopital.afficherMedcinPatients(medecin2);
    }
}
