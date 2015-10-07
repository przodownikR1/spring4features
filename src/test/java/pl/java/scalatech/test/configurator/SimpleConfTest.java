package pl.java.scalatech.test.configurator;

import lombok.extern.slf4j.Slf4j;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.java.scalatech.configuration.MyConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MyConfig.class })
@Slf4j
public class SimpleConfTest {
    private final String RETRY_EXPECTED = "33";

    @Value("#{settingConfig.retryAttempt}")
    private String retry;

    @Test
    public void shouldSetConfProperty() {
        Assertions.assertThat(retry).isEqualTo(RETRY_EXPECTED);
    }
}
