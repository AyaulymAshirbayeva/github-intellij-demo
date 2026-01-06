package healthcare;

public class MedProfessional extends Person {

    private String specialization;
    private int experience;

    public MedProfessional(String name, int age, String specialization, int experience) {
        super(name, age);
        this.specialization = specialization;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void printInfo() {
        System.out.println("Doctor -> Name: " + name +
                ", Specialization: " + specialization +
                ", Experience: " + experience + " years");
    }
}
