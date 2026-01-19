package healthcare;

public class Patient extends Person {
    private Ward ward;

    public Patient(String name, int age, Ward ward) {
        super(name, age);
        this.ward = ward;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    @Override
    public void printInfo() {
        System.out.println("Patient -> Name: " + getName() +
                ", Age: " + getAge() +
                ", Ward: " + ward.getWardNumber());
    }
}
