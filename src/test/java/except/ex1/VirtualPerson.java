package except.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VirtualPerson {
    private static final int tooCold = 65;
    private static final int tooHot = 85;

    public void drinkCoffee(CoffeeCup cup) throws
            TooColdException, TooHotException, UnusualTasteException {
        int temperature = cup.getTemperature();
        if (temperature <= tooCold) {
            throw new TooColdException(temperature);
        } else if (temperature > 1000) {
            throw new UnusualTasteException("kawa sie topi i kubek tez");
        } else if (temperature >= tooHot) {
            throw new TooHotException(temperature);
        } else {
            System.out.println("Coffee is great, perfect !!!!");
        }
        System.out.println("end of DringCoffee method");
        //...
    }
    //...


    public boolean drinkCoffee2(CoffeeCup cup) throws TooColdException,
            TemperatureException, UnusualTasteException, IOException {
        try {
            int i = (int) (Math.random() * 4.0);
            System.out.println("Your random int number 1-4 is " + i);
            //int i = 1;
            switch (i) {
                case 0:
                    throw new TooHotException(cup.getTemperature());
                case 1:
                    throw new TooColdException(cup.getTemperature());
                case 2:
                    throw new UnusualTasteException("Case 2 ecpetion unusualAAA");
                default:
                    System.out.println("Default switch selected");
            }
        } catch (TooHotException e) {
            System.out.println("catched in the same try---This coffee is too hot.");
            // Customer will wait until it cools to an
            // acceptable temperature.
        } finally {
            System.out.println("Finally keyword executed!!!!");
            File testFile = new File("myTextFile2.txt");
            FileWriter fWriter = new FileWriter(testFile);
            fWriter.append("jjj");
            fWriter.write("With Write method");
            fWriter.close();

            StringBuffer kpiBuff = new StringBuffer("aaa");


            //for(;;){}
            return true;
        }
    }
}
