package ru.echanger.exchangerclient.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.echanger.exchangerclient.web.dto.ConvertCurrencyRequestDto;
import ru.echanger.exchangerclient.web.dto.CurrencyListDto;
import ru.echanger.exchangerclient.web.dto.ExchangingRecord;

@FeignClient(name = "exchangerClient", url = "http://localhost:8081/api/v1/currency-exchanger")
public interface ExchangerFeignClient {

    @GetMapping("/currency-list")
    CurrencyListDto getCurrencyList();

    @PostMapping("/convert")
    ExchangingRecord exchangeAmount(@RequestBody ConvertCurrencyRequestDto convertCurrencyRequestDto);
}