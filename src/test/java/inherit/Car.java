package inherit;

import java.util.List;

public class Car extends Vehicle {
    private String modelName;
    private String brand;
    private List<String> owners;


    public Car() {
        super();
        System.out.println("Car construct");
    }

    public Car(String brand, String modelName, List<String> owners) {
        this();
        this.brand = brand;
        this.modelName = modelName;
        this.owners = owners;
    }

    public String getModelName() {
        return modelName;
    }


    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    void print() {
        super.print();
        System.out.println("print in Car Class");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    @Override
    void print(String myText) {
        System.out.println("mytext");
    }
}
