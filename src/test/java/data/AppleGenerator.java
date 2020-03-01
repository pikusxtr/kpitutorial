package data;

import bookjava8.predicates.Colors;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppleGenerator {
    private Apple apple;

    public AppleGenerator create(Colors color) {
        this.apple = new Apple(color);
        return this;
    }

    public AppleGenerator withWeight(int weight) {
        apple.setWeight(weight);
        return this;
    }

    public AppleGenerator withTaste(String taste) {
        apple.setTaste(taste);
        return this;
    }

    public AppleGenerator forWine(Boolean isForWine) {
        apple.setForWine(isForWine);
        return this;
    }

    public Apple build() {
        return apple;
    }

}
