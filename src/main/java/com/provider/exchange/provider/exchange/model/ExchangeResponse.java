package com.provider.exchange.provider.exchange.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ExchangeResponse {

    private Integer code;
    private String description;
}
