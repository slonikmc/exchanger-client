package ru.echanger.exchangerclient.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Микросервис по обмену валюты.",
                version = "1.0.0",
                contact = @Contact(
                        name = "Dmitry Ivanov",
                        url = "https://vk.com/slomnikc"
                )
        )
)
public class OpenApiConfig {

}