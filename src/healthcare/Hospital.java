package healthcare;

public class Hospital {

    private String name;
    private int capacity;
    private double rating;

    public Hospital() { }

    public Hospital(String name, int capacity, double rating) {
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRating() {
        return rating;
    }

    // Сеттеры (если нужны)
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void printInfo() {
        System.out.println("Hospital -> Name: " + name +
                ", Capacity: " + capacity +
                ", Rating: " + rating);
    }
}
