package streams;

import bookjava8.predicates.Colors;
import data.Apple;
import data.AppleGenerator;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class AppleGeneratorTest {
    @Test
   public void generateApple() {
        Apple apple1 = new AppleGenerator().create(Colors.RED).build();
    }


    @Test
    public void useFunction() {
        Function<AppleGenerator, AppleGenerator> appleMethod1 = appleGenerator -> appleGenerator.create(Colors.RED);
        Function<AppleGenerator, Apple> appleMethod2 = appleGenerator -> appleGenerator.withTaste("Sweet").build();
        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();
        String string = "Hii";
        Function<String, String> upperCaseOnly = upperCase;
        Function<String, String> upperCaseThenTrim = upperCase.andThen(toLower);
        Function<AppleGenerator, Apple> appleGenSum = appleMethod1.andThen(appleMethod2);
        AppleGenerator appleGenerator1 = new AppleGenerator();
        Apple resultLast=  appleGenSum.apply(appleGenerator1);
        System.out.println("RESULT=" + upperCaseOnly.apply(string));
        System.out.println("RESULT=" + upperCaseThenTrim.apply(string));
    }
}
