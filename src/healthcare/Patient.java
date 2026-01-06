package healthcare;

public class Patient extends Person {

    private Ward ward;

    public Patient(String name, int age, Ward ward) {
        super(name, age); // super operator
        this.ward = ward;
    }

    public Ward getWard() {
        return ward;
    }

    @Override
    public void printInfo() {
        System.out.println("Patient -> Name: " + name +
                ", Age: " + age +
                ", Ward: " + ward.getWardNumber());
    }
}
