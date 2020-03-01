package data;

import bookjava8.predicates.Colors;

public class Apple {
    private Colors color;
    private int weight;
    private String taste;
    private String structure;
    private Boolean isForWine;
    private Boolean isForJuice;

    public Apple(Colors color) {
        this.color = color;
    }

    public Apple(Colors color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Boolean getForWine() {
        return isForWine;
    }

    public void setForWine(Boolean forWine) {
        isForWine = forWine;
    }

    public Boolean getForJuice() {
        return isForJuice;
    }

    public void setForJuice(Boolean forJuice) {
        isForJuice = forJuice;
    }
}
