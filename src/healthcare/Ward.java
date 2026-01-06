package healthcare;

public class Ward implements Printable {

    private int wardNumber;
    private int beds;

    public Ward(int wardNumber, int beds) {
        this.wardNumber = wardNumber;
        this.beds = beds;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public int getBeds() {
        return beds;
    }

    @Override
    public void printInfo() {
        System.out.println("Ward -> Number: " + wardNumber + ", Beds: " + beds);
    }

    @Override
    public String toString() {
        return "Ward " + wardNumber;
    }
}
