package ru.echanger.exchangerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExchangerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangerClientApplication.class, args);
    }
}