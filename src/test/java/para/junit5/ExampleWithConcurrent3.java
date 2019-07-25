package para.junit5;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import para.RestCommons;

//@Execution(ExecutionMode.CONCURRENT)
public class ExampleWithConcurrent3 {
    private static Logger logger = LoggerFactory.getLogger(ExampleWithConcurrent3.class);

    @Test
    public void parallelStream01() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendCountryService("pl");
        logger.info("test end");
    }

    @Test
    public void parallelStream02() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }

    @Test
    public void parallelStream03() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }

    @Test
    public void parallelStream04() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }

    @Test
    public void parallelStream05() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendCountryService("au");
        logger.info("test end");
    }

    @Test
    public void parallelStream06() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }

    @Test
    public void parallelStream07() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendCountryService("ru");
        logger.info("test end");
    }


}