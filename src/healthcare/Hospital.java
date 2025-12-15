package healthcare;

public class Hospital {

    private String name;
    private int capacity; // число коек
    private double rating; // от 0 до 5

    public Hospital() {
    }

    public Hospital(String name, int capacity, double rating) {
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public void printInfo() {
        System.out.println("Hospital -> Name: " + name + ", Capacity: " + capacity + ", Rating: " + rating);
    }
    public int compareRating(Hospital other) {
        return Double.compare(this.rating, other.rating);
    }

    public int compareCapacity(Hospital other) {
        return Integer.compare(this.capacity, other.capacity);
    }
}
