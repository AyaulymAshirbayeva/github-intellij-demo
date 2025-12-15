package healthcare;

public class Appointment {

    private Patient patient;
    private MedProfessional doctor;
    private String date;

    public Appointment() {
    }

    public Appointment(Patient patient, MedProfessional doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }


    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedProfessional getDoctor() {
        return doctor;
    }
    public void setDoctor(MedProfessional doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public void printInfo() {
        System.out.println("Appointment -> Patient: " + patient.getName() +
                ", Doctor: " + doctor.getName() +
                ", Date: " + date);
    }
}
