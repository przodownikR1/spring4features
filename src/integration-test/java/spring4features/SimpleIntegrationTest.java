package spring4features;

import lombok.extern.slf4j.Slf4j;

import org.fest.assertions.Assertions;
import org.junit.Test;
@Slf4j
public class SimpleIntegrationTest {
    @Test
    public void shouldIntegrationTestWork(){
        log.info("+++      integration test run");
        Assertions.assertThat(true);
    }
}
