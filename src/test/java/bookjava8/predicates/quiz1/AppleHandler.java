package bookjava8.predicates.quiz1;

import bookjava8.predicates.Colors;
import data.Apple;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AppleHandler {

    @Test
    void fancyFormatterTest() {
        List<Apple> appleList = Arrays.asList(new Apple(Colors.BROWN, 200), new Apple(Colors.BLUE, 300), new Apple(Colors.RED, 100));
        prettyPrintApple(appleList, new AppleFancyFormatter());
        prettyPrintApple(appleList, new AppleSimpleFormatter());
    }

    public void prettyPrintApple(List<Apple> apples, AppleFormatter appleFormatter) {
        for (Apple apple : apples) {
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }
}
