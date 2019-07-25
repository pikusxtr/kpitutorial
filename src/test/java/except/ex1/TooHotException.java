package except.ex1;

public class TooHotException extends TemperatureException {
    public TooHotException(int temperature) {
        super(temperature);
    }
}
