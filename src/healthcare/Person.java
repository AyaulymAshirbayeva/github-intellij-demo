package healthcare;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Добавляем метод, который будет переопределяться
    public void printInfo() {
        System.out.println("Person -> Name: " + name + ", Age: " + age);
    }
}
