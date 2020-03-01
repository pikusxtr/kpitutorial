package streams;

import inherit.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamDemo {
    private static List<Car> cars;
    private static Logger logger = LoggerFactory.getLogger(StreamDemo.class);

    @BeforeAll
    public static void setUp() {
        Car carAudiA6 = new Car("Audi", "A6", Arrays.asList("Mike"));
        Car carAudiA4 = new Car("Audi", "A4", Arrays.asList("Chris", "Zenek"));
        Car carPorsche = new Car("Porsche", "Cayenne", Arrays.asList("John", "Caroline", "Judy"));
        Car carBmw = new Car("BMW", "X6", Arrays.asList("Maciek", "Greg"));

        cars = Arrays.asList(carAudiA4, carAudiA6, carBmw, carPorsche);
    }

    @Test
    public void sortingByField() {

        cars.stream().sorted(Comparator.comparing(Car::getBrand))
                .forEach(car -> logger.info(car.getBrand()));
        cars.stream().sorted(Comparator.comparing(Car::getModelName))
                .forEach(car -> logger.debug(car.getModelName()));

    }

    @Test
    public void flatMapByOwners() {
        List<String> myOwners = cars.stream()
                .flatMap(car -> car.getOwners().stream())
                .collect(toList());
        myOwners.forEach(s -> System.out.println("owner = " + s));
    }

    @Test
    public void predicateForOwnerWithChar() {
        Predicate<Car> carPredicateCharA = car -> car.getBrand().contains("A");
        Predicate<Car> carPredicateCharB = car -> car.getBrand().contains("B");
        cars
                .stream()
                .filter(Objects::nonNull)
                .filter(carPredicateCharA.or(carPredicateCharB))
                .forEach(car -> logger.debug(car.getBrand()));
    }

    @Test
    void evenNumbersTest() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 6,10, 13, 10, 2, 11, 17);
        List<Integer> integerListBasic = Arrays.asList(1, 2,3);
        Integer evenDoubleSum = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(integer -> integer * 2)
                .sum();
        Integer evenDoubleSum2 = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(integer -> integer * 2)
                .reduce(0, Integer::sum);


        Double evenDoubleMax = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(integer -> integer * 3)
                .max()
                .orElse(0);
        Double evenDoubleAvg = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToDouble(integer -> integer * 3)
                .average()
                .orElse(0);

        Double evenDoubleAvg2 = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();


//        Double evenDoubleAvg3 = integerListBasic.stream()
//                .map(BigDecimal::new)
//                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.divide(BigDecimal.valueOf(integerList.size())).add(bigDecimal2.divide(BigDecimal.valueOf(integerList.size())))  )
//                .doubleValue();

        Double evenDoubleAvg4 = integerListBasic.stream()
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.divide(BigDecimal.valueOf(integerListBasic.size()),5, RoundingMode.HALF_DOWN ).add(bigDecimal2.divide(BigDecimal.valueOf(integerListBasic.size()), 5, RoundingMode.HALF_DOWN))  )
                .doubleValue();
        Double evenDoubleAvg5 = integerListBasic.stream()
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2).add(BigDecimal.ONE))
                .doubleValue();
        List<Integer>  intListDistinct = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        logger.info("evenDoubleSum={}", evenDoubleSum);
        logger.info("evenDoubleSum2={}", evenDoubleSum2);
        logger.info("evenDoubleMax={}", evenDoubleMax);
        logger.info("evenDoubleAvg={}", evenDoubleAvg);
        logger.info("evenDoubleAvg2={}", evenDoubleAvg2);
//        logger.info("evenDoubleAvg3={}", evenDoubleAvg3);
        logger.info("evenDoubleAvg4={}", evenDoubleAvg4);
        logger.info("evenDoubleAvg5={}", evenDoubleAvg5);
        logger.info("intDistinct={}", intListDistinct);
    }
}