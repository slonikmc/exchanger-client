package ru.echanger.exchangerclient.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConvertCurrencyRequestDto {

    private Double amount;
    private String currencyPair;
}