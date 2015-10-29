package pl.java.scalatech.test.config;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.test.config.domain.Engine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EngineConfig.class)
@ActiveProfiles(profiles = "config")
@Slf4j
public class ConfigTest {

    @Rule
    public BenchmarkRule benchmarkRun = new BenchmarkRule();

    @Autowired
    Engine steamEngine;

    @Autowired
    @Qualifier("steamEngineC")
    Engine steamEngineC;

    @Autowired
    List<Engine> engines;

    @Test
    public void shouldInjectIntoList() {
        Assertions.assertThat(engines).hasSize(4);
        log.info("{}", engines);
    }

    @Test
    public void shouldConfigAutowired() {
        Assertions.assertThat(steamEngine).isNotNull();
        log.info("steam : {}", steamEngine.getName());

    }

    @Test
    public void shouldConfigAutowiredC() {
        Assertions.assertThat(steamEngineC).isNotNull();
        log.info("steam : {}", steamEngineC.getName());

    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 20, warmupRounds = 4)
    public void shouldProfile() {
        ProfileEngine.expensiveMethod();
    }
}

class ProfileEngine {

    static void expensiveMethod() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            sb.append("i                " + i);

        }

    }
}