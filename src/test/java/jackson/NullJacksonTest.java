package jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class NullJacksonTest {
    private static Logger logger = LoggerFactory.getLogger(NullJacksonTest.class);

    @Test
    void ignoringNullsInJsonRs() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        MyDto dtoObject = new MyDto();

        String dtoAsString = mapper.writeValueAsString(dtoObject);
        logger.info("Json value={}", dtoAsString);

        assertThat(dtoAsString, containsString("intValue"));
        assertThat(dtoAsString, not(containsString("stringValue")));
        assertThat(dtoAsString, not(containsString("stringList")));
    }

    @Test
    public void givenNullsIgnoredGlobally_whenWritingObjectWithNullField_thenIgnored()
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        MyDto dtoObject = new MyDto();

        String dtoAsString = mapper.writeValueAsString(dtoObject);
        logger.info("Json value={}", dtoAsString);

        assertThat(dtoAsString, containsString("intValue"));
        assertThat(dtoAsString, containsString("booleanValuePrimitive"));
        assertThat(dtoAsString, not(containsString("booleanValue\"")));
        assertThat(dtoAsString, not(containsString("stringValue")));
        assertThat(dtoAsString, not(containsString("stringList")));
    }


    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter();

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper()
                .writeValueAsString(bean);
        logger.info("Json value={}", result);

        assertThat(result, containsString("attr1"));
        assertThat(result, containsString("val1"));
    }
}
