package com.provider.exchange.provider.exchange.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ExchangeResponse implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Integer code;
    private String description;
}
