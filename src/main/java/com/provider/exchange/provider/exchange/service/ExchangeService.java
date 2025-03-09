package com.provider.exchange.provider.exchange.service;

import com.provider.exchange.provider.exchange.model.ExchangeResponse;
import reactor.core.publisher.Flux;

public interface ExchangeService {

    Flux<ExchangeResponse> getExchangeResponses();
}
