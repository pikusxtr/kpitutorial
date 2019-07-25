package except.ex1;

public class TemperatureException extends Exception {
    private int temperature;

    public TemperatureException(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
