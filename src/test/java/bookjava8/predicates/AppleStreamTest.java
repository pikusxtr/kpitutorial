package bookjava8.predicates;

import data.Apple;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static bookjava8.predicates.Colors.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppleStreamTest {
    @Test
    void forLoopAppleFilter() {
        Apple appleGreen1 = new Apple(GREEN);
        Apple appleGreen2 = new Apple(GREEN);
        Apple appleRed1 = new Apple(RED);
        Apple appleBlue1 = new Apple(BLUE);
        List<Apple> allApples = Arrays.asList(appleGreen1, appleGreen2, appleRed1, appleBlue1);
        List<Apple> greenApples = filterGreenApples(allApples);
        List<Apple> greenApples2 = filterApplesByColor(allApples, GREEN);
        List<Apple> greenApples3 = filterApplesWithPredict(allApples, new AppleGreenColorPredic());
//        assertThat(greenApples.get(0).getColor()).isEqualTo(GREEN);
        assertThat(greenApples2.get(0).getColor()).isEqualTo(GREEN);
        assertThat(greenApples3.get(0).getColor()).isEqualTo(GREEN);
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Colors color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesWithPredict(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public interface    ApplePredicate {
        boolean test(Apple apple);
    }

    public class AppleHeavyWeightPredic implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }


    public class AppleGreenColorPredic implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return GREEN.equals(apple.getColor());
        }
    }


}
