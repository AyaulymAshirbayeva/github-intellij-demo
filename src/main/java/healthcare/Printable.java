package healthcare;
public interface Printable {
    void printInfo();
    default String shortInfo(String name) {
        return "Info: " + name;}
}

