package healthcare;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Ward w1 = new Ward(101, 4);
        Ward w2 = new Ward(102, 2);

        Patient p1 = new Patient("Artem", 11, w1);
        Patient p2 = new Patient("Svetlana", 71, w1);
        Patient p3 = new Patient("Talgat", 47, w2);

        MedProfessional d1 = new MedProfessional("Adina", 35, "Therapist", 10);
        MedProfessional d2 = new MedProfessional("Zhansaya", 29, "Surgeon", 5);

        Hospital h1 = new Hospital("City Hospital", 500, 4.5);

        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(p1, d1, "15.12.2025"));
        appointments.add(new Appointment(p2, d1, "15.12.2025"));
        appointments.add(new Appointment(p3, d2, "15.12.2025"));

        System.out.println("=== POLYMORPHISM ===");
        Printable[] items = {p1, d1, w1, h1};
        for (Printable item : items) {
            item.printInfo();
        }

        System.out.println("\n=== FILTERING ===");
        appointments.stream()
                .filter(a -> a.getDoctor().equals(d1))
                .forEach(System.out::println);

        System.out.println("\n=== SORTING ===");
        appointments.sort(Comparator.comparing(a -> a.getPatient().getName()));
        appointments.forEach(System.out::println);
    }
}
