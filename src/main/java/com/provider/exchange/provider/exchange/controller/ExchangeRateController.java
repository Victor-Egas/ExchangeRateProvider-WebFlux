package com.provider.exchange.provider.exchange.controller;

import com.provider.exchange.provider.exchange.model.ExchangeResponse;
import com.provider.exchange.provider.exchange.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/provider")
public class ExchangeRateController {

    @Autowired
    private ExchangeService service;

    @GetMapping("/all")
    public Flux<ExchangeResponse> getCurrencyCodes() {
        return service.getExchangeResponses();
    }
}
