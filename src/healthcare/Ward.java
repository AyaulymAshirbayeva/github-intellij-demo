package healthcare;

public class Ward {

    private int wardNumber;
    private int beds;

    public Ward() {
    }

    public Ward(int wardNumber, int beds) {
        this.wardNumber = wardNumber;
        this.beds = beds;
    }

    public int getWardNumber() {
        return wardNumber;
    }
    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }


    public int getBeds() {
        return beds;
    }
    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void printInfo() {
        System.out.println("Ward -> Number: " + wardNumber + ", Beds: " + beds);
    }
}
