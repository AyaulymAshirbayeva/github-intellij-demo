package healthcare;

public class Patient {

    private String name;
    private int age;
    private Ward ward;

    public Patient() {
    }

    public Patient(String name, int age,  Ward ward) {
        this.name = name;
        this.age = age;
        this.ward = ward;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public Ward getWard() {
        return ward;
    }
    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public void printInfo() {
        System.out.println("Patient -> Name: " + name + ", Age: " + age + ", Ward: " + ward.getWardNumber());
    }
}
