package pl.java.scalatech.conditional;

import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfig {

    @AvailableOnClasspath("com.mobilepetroleum.SpringConsole")
    Object springConsole() throws Exception {
        return Class.forName("com.mobilepetroleum.SpringConsole").newInstance();
    }

    @AvailableOnClasspath("org.postgresql.Driver")
    String postgresDriver() {
        return "org.postgresql.Driver";
    }

}