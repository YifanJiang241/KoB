package com.kob.matchingsystem;


import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {

        MatchingServiceImpl.matchingpool.start();
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}