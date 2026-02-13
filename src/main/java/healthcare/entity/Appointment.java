package healthcare.entity;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;   // можно просто строку для простоты

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    // --- связь с врачом ---
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private MedProfessional doctor;

    // --- связь с больницей ---
    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    public Appointment() {}

    public Appointment(String date, Patient patient,
                       MedProfessional doctor, Hospital hospital) {
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
    }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public MedProfessional getDoctor() { return doctor; }
    public void setDoctor(MedProfessional doctor) { this.doctor = doctor; }

    public Hospital getHospital() { return hospital; }
    public void setHospital(Hospital hospital) { this.hospital = hospital; }
}
