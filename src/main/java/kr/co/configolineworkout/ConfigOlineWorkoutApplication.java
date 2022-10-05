package kr.co.configolineworkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigOlineWorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigOlineWorkoutApplication.class, args);
    }

}
