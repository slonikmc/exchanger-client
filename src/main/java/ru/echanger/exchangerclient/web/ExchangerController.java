package ru.echanger.exchangerclient.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.echanger.exchangerclient.web.client.ExchangerFeignClient;
import ru.echanger.exchangerclient.web.dto.ConvertCurrencyRequestDto;
import ru.echanger.exchangerclient.web.dto.CurrencyListDto;
import ru.echanger.exchangerclient.web.dto.ExchangingRecord;

@Tag(name = "Контроллер по обмену валюты")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/exchanger")
public class ExchangerController {

    private final ExchangerFeignClient exchangerFeignClient;

    @Operation(summary = "Получения списка валют",
            description = "Метод ничего не принимает, возвращает список валютных пар")
    @GetMapping("/currency-list")
    public CurrencyListDto getCurrencyList() {
        log.info("Getting currency list");
        return exchangerFeignClient.getCurrencyList();
    }

    @Operation(summary = "Обмен валюты",
            description = """
                    Метод принимает валютную пару и сумму для обмена, возвращает dto с курсом обмена и итоговую сумму с датой
                    """)
    @PostMapping("/convert")
    public ExchangingRecord exchangeAmount(@RequestBody ConvertCurrencyRequestDto convertCurrencyRequestDto) {
        log.info("Exchanging amount: {}, pair:{}", convertCurrencyRequestDto.getAmount(), convertCurrencyRequestDto.getCurrencyPair());
        return exchangerFeignClient.exchangeAmount(convertCurrencyRequestDto);
    }
}