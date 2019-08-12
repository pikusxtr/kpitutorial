package streams;

import inherit.Car;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import para.junit5.ExampleWithConcurrent2;

import java.util.Arrays;
import java.util.Optional;

public class OptionalsTest {
    private static Logger logger = LoggerFactory.getLogger(ExampleWithConcurrent2.class);

    @Test
    void getEmptyValue() {
        Optional<String> emptyStrOpt  = Optional.of("");
logger.info("optional value is present={}", emptyStrOpt.isPresent());
logger.info("optional value is empty={}", emptyStrOpt.get());
    }

    @Test
    void optionalsFlatMap() {
        Car car1 = new Car("Audi", "Q5", Arrays.asList("SalonA", "SalonB"));
        Optional<Car> carOptional = Optional.of(car1);
        String name = carOptional
                .flatMap(Car::getBrandOpt)
                .orElse("");
        logger.info("ownersFlat={}", name);
    }

    @Test
    void filterTest1() {
        Car car1 = new Car("Audi", "Q5", Arrays.asList("SalonA", "SalonB"));
        Optional<Car> carOptional = Optional.of(car1);
        logger.info("Filtered values with q={}", carOptional
                .filter(car -> car.getModelName().startsWith("Q"))
                .map(Car::getModelName).
                        orElse("ERROR NOT FAOUND"));

    }
}
