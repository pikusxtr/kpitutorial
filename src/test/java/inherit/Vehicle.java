package inherit;

public class Vehicle {

    String name;

    public String getName() {
        return name;
    }

    void print() {
        System.out.println("Print in Vehicle class");
    }

    void print(String myText) {
        System.out.println("Print in Vehicle class");
    }

    final void notOverride() {
        System.out.println("cant overrwrde");
    }
}
