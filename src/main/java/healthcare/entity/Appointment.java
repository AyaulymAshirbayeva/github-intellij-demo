package healthcare.entity;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Связь с пациентом
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // Связь с врачом
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private MedProfessional doctor;

    // Связь с больницей
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    private String dateTime;

    public Appointment() {}

    public Appointment(Patient patient, MedProfessional doctor, Hospital hospital, String dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
        this.dateTime = dateTime;
    }

    // getters/setters
    public Long getId() { return id; }
    public Patient getPatient() { return patient; }
    public MedProfessional getDoctor() { return doctor; }
    public Hospital getHospital() { return hospital; }
    public String getDateTime() { return dateTime; }

    public void setPatient(Patient patient) { this.patient = patient; }
    public void setDoctor(MedProfessional doctor) { this.doctor = doctor; }
    public void setHospital(Hospital hospital) { this.hospital = hospital; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
}
