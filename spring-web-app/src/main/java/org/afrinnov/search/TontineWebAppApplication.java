package org.afrinnov.search;

import lombok.extern.slf4j.Slf4j;
import org.afrinnov.Video;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@Slf4j
@SpringBootApplication
public class TontineWebAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TontineWebAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Video video = Video.builder()
                .withId(UUID.randomUUID().toString())
                .build();
        log.info(String.valueOf(video));
    }
}
