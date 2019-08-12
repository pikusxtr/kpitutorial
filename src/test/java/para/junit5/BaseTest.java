package para.junit5;

import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeAll
    public static void setUp() {
        logger.info("this is setUp");
    }

}
