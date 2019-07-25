package except.ex1;

import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws TemperatureException, IOException {
        int temperature = 1000;
        if (temperature > 0) {
            try {
                temperature = Integer.valueOf(temperature);
            } catch (NumberFormatException e) {
                System.out.println(
                        "Must enter integer as first argument.");
                return;
            }
        } else {
            System.out.println(
                    "Must enter temperature as first argument.");
            return;
        }
        // Create a new coffee cup and set the temperature of
        // its coffee.
        CoffeeCup cup = new CoffeeCup();
        cup.setTemperature(temperature);
        // Create and serve a virtual customer.
        VirtualPerson cust = new VirtualPerson();
        //cust.drinkCoffee(cup);
        try {
            VirtualCafe.serveCustomer(cust, cup);
        } catch (UnusualTasteException e) {
            System.out.println(e.getMessage());
        }
    }
}
