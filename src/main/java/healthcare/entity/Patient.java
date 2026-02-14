package healthcare.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
@JsonIgnoreProperties({"appointments"})
@Entity
@Table(name = "patients")
public class Patient {
    @OneToMany(mappedBy = "patient")
    @JsonManagedReference
    private List<Appointment> appointments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    public Patient() {}

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
