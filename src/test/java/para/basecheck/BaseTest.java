package para.basecheck;

import bookjava8.predicates.Colors;
import data.Apple;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static Logger logger = LoggerFactory.getLogger(BaseTest.class);
private static int baseNum ;
private static Apple appleStat = new Apple(Colors.GREEN,300);

    @BeforeAll
    public static void setUp() {
        logger.info("AAAAA this is setUp");
        baseNum++;
         appleStat.setWeight(appleStat.getWeight() + 400);
        logger.info("AAAA base num={}", baseNum);
        logger.info("AAA aple weight={}", appleStat.getWeight());
    }

}
