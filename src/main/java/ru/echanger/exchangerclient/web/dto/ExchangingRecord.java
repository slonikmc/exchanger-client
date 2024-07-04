package ru.echanger.exchangerclient.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class ExchangingRecord {

    private UUID id;
    private Double amount;
    private String exchangeCurrency;
    private String receivingCurrency;
    private Double convertedAmount;
    private Double exchangeRate;
    private LocalDateTime operationDateTime;
}