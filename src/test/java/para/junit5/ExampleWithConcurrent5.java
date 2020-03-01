package para.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import para.RestCommons;

import static org.junit.jupiter.api.parallel.ResourceAccessMode.READ_WRITE;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ResourceLock(value = "ExampleWithConcurrent5", mode = READ_WRITE)
public class ExampleWithConcurrent5 {
    private static Logger logger = LoggerFactory.getLogger(ExampleWithConcurrent5.class);

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
        RestCommons.sendSlowServiceMock();
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
        RestCommons.sendSlowServiceMock();
        logger.info("test end");
    }


}