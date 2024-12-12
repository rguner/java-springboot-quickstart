package org.couchbase.quickstart.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class, proxyBeanMethods = false)
public class CouchBaseQuickStartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(CouchBaseQuickStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CouchBaseQuickStartApplication.class, args);
    }

    public void run(String... args) {
        log.info("Application started successfully.");
    }

}
