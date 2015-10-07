package pl.java.scalatech.component.conf;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SettingConfig {

    @Getter
    private final String retryAttempt;
    @Getter
    private final String retryTime;

    @Autowired
    public SettingConfig(Environment env) {
        retryAttempt = "33"; //TODO get from DB
        retryTime = "44";//TODO get from DB
        log.info("Retry Attempt :  {}  , retryTime : {}", retryAttempt, retryTime);

    }

}