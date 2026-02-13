package healthcare.pattern;

import healthcare.entity.Hospital;

public class HospitalBuilder {

    private String name;
    private int capacity;
    private double rating;

    public HospitalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HospitalBuilder setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public HospitalBuilder setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public Hospital build() {
        return new Hospital(name, capacity, rating);
    }
}
