package para;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ExampleWithRunTest {
    private static Logger logger = LoggerFactory.getLogger(ExampleWithRunTest.class);
    private static String baseUrl = "https://restcountries.eu/rest/v2/alpha/";


    @Test
    public void parallelStream01() {
        logger.info("test start");
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(() -> logger.debug("AAA run01 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));
        runnableList.add(() -> logger.info("AAA run02 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));
        runnableList.add(() -> logger.info("AAA run03 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));
        runnableList.add(() -> logger.info("AAA run04 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));
        runnableList.add(() -> logger.info("AAA run05 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));
        runnableList.add(() -> logger.info("AAA run06 ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime()));

//                Arrays.asList(
//                () -> checkSnippet(folderDataC02, true),
//                () -> checkSnippet(folderDataC06, true));
        runnableList
//                .parallelStream()
                .forEach(Runnable::run);
    }

    @Test
    public void test02() {
        logger.info("SSSSSSSSSSSS");
        logger.info("SSSSSSSSS232323SSS");
    }

    void testCountryService(String countryCode) {
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        String respone = given().when()
                .get(baseUrl + countryCode)
                .then().assertThat().statusCode(200)
                .extract().jsonPath().prettyPrint();
        logger.info("response= {}", respone);
    }

    @Test
    public void parallelStream02() {
        logger.info("test start");
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(() -> testCountryService("pl"));
        runnableList.add(() -> testCountryService("de"));
        runnableList.add(() -> testCountryService("es"));
        runnableList.add(() -> testCountryService("gb"));
        runnableList.add(() -> testCountryService("au"));
        runnableList.add(() -> testCountryService("fr"));

//                Arrays.asList(
//                () -> checkSnippet(folderDataC02, true),
//                () -> checkSnippet(folderDataC06, true));
        runnableList
//                .parallelStream()
                .forEach(Runnable::run);
    }
}