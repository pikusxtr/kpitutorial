package para;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;

public class RestCommons {
    private static final String baseUrl = "https://restcountries.eu/rest/v2/alpha/";
    private static final String baseUrlSlow = "http://slowwly.robertomurray.co.uk/delay/4000/url/http://www.google.co.uk";
    private static Logger logger = LoggerFactory.getLogger(RestCommons.class);

    public static void sendCountryService(String countryCode) {

        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        String respone = given().when()
                .get(baseUrl + countryCode)
                .then()
                .log().ifError()
                .assertThat().statusCode(200)
                .extract().jsonPath().prettyPrint();
        logger.info("response= {}", respone);
    }

    public static void sendSlowServiceMock() {
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        String respone = given().when()
                .get(baseUrlSlow)
                .then()
                .log().ifError()
                .assertThat().statusCode(200)
                .extract().asString();
        logger.info("response= {}", respone);
    }

}
