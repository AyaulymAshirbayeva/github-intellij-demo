package healthcare;

public class MedProfessional {

    private String name;
    private String specialization;
    private int experience;

    public MedProfessional() { }

    public MedProfessional(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Печать информации
    public void printInfo() {
        System.out.println("MedProfessional -> Name: " + name +
                ", Specialization: " + specialization +
                ", Experience: " + experience + " years");
    }
}
