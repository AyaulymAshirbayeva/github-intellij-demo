package healthcare;

import java.util.Objects;

public class Appointment implements Printable {

    private Patient patient;
    private MedProfessional doctor;
    private String date;

    public Appointment(Patient patient, MedProfessional doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public MedProfessional getDoctor() {
        return doctor;
    }

    @Override
    public void printInfo() {
        System.out.println("Appointment -> Patient: " +
                patient.getName() +
                ", Doctor: " +
                doctor.getName() +
                ", Date: " + date);
    }

    @Override
    public String toString() {
        return patient.getName() + " with " + doctor.getName() + " on " + date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(patient, that.patient) &&
                Objects.equals(doctor, that.doctor) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, doctor, date);
    }
}
