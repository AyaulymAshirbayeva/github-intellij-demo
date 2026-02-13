package healthcare.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "medprofessionals")
public class MedProfessional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private int experience;

    public MedProfessional() {}

    public MedProfessional(String name,  String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    @OneToMany(mappedBy = "doctor")
    private Collection<Appointment> appointment;

    public Collection<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(Collection<Appointment> appointment) {
        this.appointment = appointment;
    }
}
