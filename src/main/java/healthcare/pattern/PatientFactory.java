package healthcare.pattern;
import healthcare.entity.Patient;
public class PatientFactory {
    public static Patient createAdult(String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Patient must be adult");
        }
        return new Patient(name, age);
    }
}
