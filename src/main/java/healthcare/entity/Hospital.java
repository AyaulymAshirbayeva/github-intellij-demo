package healthcare.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int capacity;
    private double rating;

    public Hospital() {}

    public Hospital(String name, int age) {
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
    }

    public Hospital(String name, int capacity, double rating) {
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
}
