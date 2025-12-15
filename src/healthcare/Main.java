package healthcare;

public class Main {

    public static void main(String[] args) {

        Ward ward1 = new Ward(101, 4);
        Ward ward2 = new Ward(102, 2);

        Patient p1 = new Patient("Artem", 11, ward1);
        Patient p2 = new Patient("Svetlana", 71,  ward1);
        Patient p3 = new Patient("Talgat", 47,  ward2);

        MedProfessional doc1 = new MedProfessional("Adina Sagynbekova", "Therapist", 10);
        MedProfessional doc2 = new MedProfessional("Zhansaya Spash", "Surgeon", 5);

        Hospital h1 = new Hospital("№1 Hospital", 500, 4.5);
        Hospital h2 = new Hospital("Medical Assisstance Group", 300, 4.8);

        Appointment[] appointments = {
                new Appointment(p1, doc1, "15.12.2025"),
                new Appointment(p2, doc1, "15.12.2025"),
                new Appointment(p3, doc2, "15.12.2025")
        };

        System.out.println("=== HEALTHCARE INFO ===");
        ward1.printInfo();
        ward2.printInfo();
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        doc1.printInfo();
        doc2.printInfo();
        h1.printInfo();
        h2.printInfo();
        for (int i = 0; i < appointments.length; i++) {
            appointments[i].printInfo();
        }

        System.out.println("\n=== DOCTOR EXPERIENCE COMPARISON ===");
        if (doc1.getExperience() > doc2.getExperience()) {
            System.out.println(doc1.getName() + " is more experienced than " + doc2.getName());
        } else if (doc1.getExperience() < doc2.getExperience()) {
            System.out.println(doc2.getName() + " is more experienced than " + doc1.getName());
        } else {
            System.out.println("Both doctors have the same experience");
        }


        System.out.println("\n=== PATIENT COUNT IN WARDS ===");
        Patient[] patients = {p1, p2, p3};
        int countWard1 = 0, countWard2 = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getWard() == ward1) {
                countWard1++;
            } else if (patients[i].getWard() == ward2) {
                countWard2++;
            }
        }
        System.out.println("Ward 101 patients: " + countWard1);
        System.out.println("Ward 102 patients: " + countWard2);

        System.out.println("\n=== HOSPITAL COMPARISON ===");
        if (h1.getRating() > h2.getRating()) {
            System.out.println(h1.getName() + " is the best hospital");
        } else {
            System.out.println(h2.getName() + " is the best hospital");
        }

        if (h1.getCapacity() > h2.getCapacity()) {
            System.out.println(h1.getName() + " has more capacity");
        } else {
            System.out.println(h2.getName() + " has more capacity");
        }

        System.out.println("\n=== DOCTOR APPOINTMENTS TODAY ===");
        int appointmentsDoc1 = 0;
        int appointmentsDoc2 = 0;

        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i].getDoctor() == doc1) {
                appointmentsDoc1++;
            }
            else if (appointments[i].getDoctor() == doc2) {
                appointmentsDoc2++;
            }
        }

        System.out.println(doc1.getName() + ": " + appointmentsDoc1 + " appointments");
        System.out.println(doc2.getName() + ": " + appointmentsDoc2 + " appointments");
    }
}
