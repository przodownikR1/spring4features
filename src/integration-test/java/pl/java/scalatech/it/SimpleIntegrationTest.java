package pl.java.scalatech.it;

import lombok.extern.slf4j.Slf4j;

import org.assertj.core.api.Assertions;
import org.junit.Test;

@Slf4j
public class SimpleIntegrationTest {
    @Test
    public void shouldIntegrationTestWork() {
        log.info("+++      integration test run");
        Assertions.assertThat(true);
    }
}
