package para.junit5;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import para.RestCommons;

//@Execution(ExecutionMode.CONCURRENT)
public class ExampleWithConcurrent {
    private static Logger logger = LoggerFactory.getLogger(ExampleWithConcurrent.class);

    @Test
    public void parallelStream01() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }

    @Test
    public void parallelStream02() {
        logger.info("test start");
        logger.info("AAA ---Thread Name= {} --- {}", Thread.currentThread().getName(), System.nanoTime());
        RestCommons.sendCountryService("de");
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
        RestCommons.sendCountryService("sk");
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