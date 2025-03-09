package com.provider.exchange.provider.exchange.service;

import com.provider.exchange.provider.exchange.model.ExchangeResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService{

    @Override
    public Flux<ExchangeResponse> getExchangeResponses() {
        List<ExchangeResponse> exchangeResponses = new ArrayList<>();
        exchangeResponses.add(ExchangeResponse.builder().code(1).description("Soles").build());
        exchangeResponses.add(ExchangeResponse.builder().code(2).description("Dolares").build());
        return Flux.fromIterable(exchangeResponses);
    }
}
