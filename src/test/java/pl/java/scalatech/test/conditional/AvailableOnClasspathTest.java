package pl.java.scalatech.test.conditional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pl.java.scalatech.test.features.LazyTest.AppConfig;

public class AvailableOnClasspathTest {

    private AbstractApplicationContext context;

    @Before
    public void before() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @After
    public void after() {
        context.close();
    }

    @Test
    public void shouldNotLoadSpringConsole() {
        // when
        boolean springConsoleExist = context.containsBean("springConsole");
        // then
       assertThat(springConsoleExist).isFalse();
    }

    @Test
    public void shouldLoadPostgresDriver() {
        // when
        boolean postgresDriverExist = context.containsBean("postgresDriver");
        // then
        assertThat(postgresDriverExist).isFalse();
    }

}