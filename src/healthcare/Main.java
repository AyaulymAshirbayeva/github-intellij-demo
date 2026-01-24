package healthcare;

public class Main {

    public static void main(String[] args) {

        // ======== Wards ========
        Ward ward1 = new Ward(101, 4);
        Ward ward2 = new Ward(102, 2);

        // ======== Patients ========
        Patient p1 = new Patient("Artem", 11, ward1);
        Patient p2 = new Patient("Svetlana", 71, ward1);
        Patient p3 = new Patient("Talgat", 47, ward2);

        // Добавляем пациентов в БД
        PatientDB.addPatient(p1);
        PatientDB.addPatient(p2);
        PatientDB.addPatient(p3);

        System.out.println("\n=== PATIENTS ===");
        PatientDB.readPatients();

        // Обновляем возраст пациента
        PatientDB.UpdatePatient("Artem", 12);  // пример: пациент с id=1
        System.out.println("\n=== PATIENTS AFTER UPDATE ===");
        PatientDB.readPatients();

        // Удаляем пациента
        PatientDB.deletePatient("Talgat");  // пример: удалить Talgat
        System.out.println("\n=== PATIENTS AFTER DELETE ===");
        PatientDB.readPatients();

        // ======== Med Professionals ========
        MedProfessional doc1 = new MedProfessional("Adina Sagynbekova", "Therapist", 10);
        MedProfessional doc2 = new MedProfessional("Zhansaya Spash", "Surgeon", 5);

        MedProfessionalDB.addMedProfessional(doc1);
        MedProfessionalDB.addMedProfessional(doc2);

        System.out.println("\n=== MED PROFESSIONALS ===");
        MedProfessionalDB.readMedProfessionals();

        // Обновляем опыт
        MedProfessionalDB.updateMedExperience("Adina Sagynbekova", 12);
        System.out.println("\n=== MED PROFESSIONALS AFTER UPDATE ===");
        MedProfessionalDB.readMedProfessionals();

        // Удаляем врача
        MedProfessionalDB.deleteMedProfessional("Zhansaya Spash");
        System.out.println("\n=== MED PROFESSIONALS AFTER DELETE ===");
        MedProfessionalDB.readMedProfessionals();

        // ======== Hospitals ========
        Hospital h1 = new Hospital("№1 Hospital", 500, 4.5);
        Hospital h2 = new Hospital("Medical Assistance Group", 300, 4.8);

        HospitalDB.addHospital(h1);
        HospitalDB.addHospital(h2);

        System.out.println("\n=== HOSPITALS ===");
        HospitalDB.readHospitals();

        System.out.println("\n=== HOSPITALS ===");
        HospitalDB.readHospitals();

        HospitalDB.updateHospitalRating("№1 Hospital", 4.7);
        System.out.println("\n=== HOSPITALS AFTER UPDATE ===");
        HospitalDB.readHospitals();


        HospitalDB.deleteHospital("Medical Assistance Group");
        System.out.println("\n=== HOSPITALS AFTER DELETE ===");
        HospitalDB.readHospitals();

    }
}
