package bookjava8.predicates.quiz1;

import data.Apple;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 200 ? "heavy" : "light";
        return characteristic + " apple of color " + apple.getColor();
    }
}
