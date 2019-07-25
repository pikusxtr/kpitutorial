package except.ex1;

import java.io.IOException;

public class VirtualCafe {
    public static void serveCustomer(VirtualPerson cust,
                                     CoffeeCup cup) throws UnusualTasteException, TemperatureException, IOException {
        try {
            //cust.drinkCoffee(cup);
            System.out.println("drinkCoffee result=" + cust.drinkCoffee2(cup));

            System.out.println("main try----Coffee is just right.");
        }
//        catch (UnusualTasteException e) {
//        System.out.println("catched unuusual tasteeee");
//        }
        catch (TooColdException e) {
            int temperature = e.getTemperature();
            System.out.println("Coffee is too cold., temp=" + temperature);
            // Deal with an irate customer...
        }
//        catch (TemperatureException e) {
//            System.out.println("Coffee is too cold or too hot");
//        }

//        catch (TooColdException e) {
//            System.out.println("Coffee is too cold.");
//            // Deal with an irate customer...
//        }
//        catch (TooHotException e) {
//            System.out.println("Coffee is too hot.");
//            // Deal with an irate customer...
//        }
    }
}
