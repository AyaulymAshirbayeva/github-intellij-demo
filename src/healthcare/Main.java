package healthcare;

public class Main {

    public static void main(String[] args) {
        PatientDB.clearPatients();
        HospitalDB.clearHospitals();
        MedProfessionalDB.clearMedProfessionals();

        Ward ward1 = new Ward(101, 4);
        Ward ward2 = new Ward(102, 2);

        Patient p1 = new Patient("Merei", 27, ward1);
        Patient p2 = new Patient("Artem", 11, ward1);
        Patient p3 = new Patient("Talgat", 47, ward1);

        PatientDB.addPatient(p1);
        PatientDB.addPatient(p2);
        PatientDB.addPatient(p3);

        System.out.println("\n=== PATIENTS ===");
        PatientDB.readPatients();

        PatientDB.UpdatePatient("Artem", 12);
        System.out.println("\n=== PATIENTS AFTER UPDATE ===");
        PatientDB.readPatients();

        PatientDB.deletePatient("Talgat");
        System.out.println("\n=== PATIENTS AFTER DELETE ===");
        PatientDB.readPatients();

        MedProfessional doc1 = new MedProfessional("Daniya Merekekyzy", "Dentist" +
                "", 4);
        MedProfessional doc2 = new MedProfessional("Adina Sagynbekova", "Surgeon" +
                "", 12);
        MedProfessional doc3 = new MedProfessional("Zhansaya Spash", "Therapist" +
                "", 7);

        MedProfessionalDB.addMedProfessional(doc1);
        MedProfessionalDB.addMedProfessional(doc2);
        MedProfessionalDB.addMedProfessional(doc3);

        System.out.println("\n=== MED PROFESSIONALS ===");
        MedProfessionalDB.readMedProfessionals();

        MedProfessionalDB.updateMedExperience("Adina Sagynbekova", 13);
        System.out.println("\n=== MED PROFESSIONALS AFTER UPDATE ===");
        MedProfessionalDB.readMedProfessionals();

        MedProfessionalDB.deleteMedProfessional("Zhansaya Spash");
        System.out.println("\n=== MED PROFESSIONALS AFTER DELETE ===");
        MedProfessionalDB.readMedProfessionals();

        Hospital h1 = new Hospital("Altai Clinic", 200, 5.0);
        Hospital h2 = new Hospital("№1 Hospital", 500, 4.4);
        Hospital h3 = new Hospital("Medical Assisstance Group", 350, 4.7);

        HospitalDB.addHospital(h1);
        HospitalDB.addHospital(h2);
        HospitalDB.addHospital(h3);

        System.out.println("\n=== HOSPITALS ===");
        HospitalDB.readHospitals();


        HospitalDB.updateHospitalRating("Altai Clinic", 4.9);
        System.out.println("\n=== HOSPITALS AFTER UPDATE ===");
        HospitalDB.readHospitals();


        HospitalDB.deleteHospital("№1 Hospital");
        System.out.println("\n=== HOSPITALS AFTER DELETE ===");
        HospitalDB.readHospitals();

    }
}
