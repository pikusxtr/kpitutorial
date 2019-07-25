package except.ex1;

public class TooColdException extends TemperatureException {
    public TooColdException(int temperature) {
        super(temperature);
    }
}
