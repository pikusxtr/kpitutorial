package kpitutorial;

/**
 * Created by kpiekos on 7/13/2017.
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("Name chosen is " + name);
    }

    public int getPuppyAge() {
        System.out.println("Puppy Age is " + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int age) {
        puppyAge = age;
    }
}
