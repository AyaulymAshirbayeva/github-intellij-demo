package healthcare;

public final class Hospital implements Printable {

    private String name;
    private int capacity;
    private double rating;

    public Hospital(String name, int capacity, double rating) {
        this.name = name;
        this.capacity = capacity;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Hospital -> Name: " + name +
                ", Capacity: " + capacity +
                ", Rating: " + rating);
    }
}

