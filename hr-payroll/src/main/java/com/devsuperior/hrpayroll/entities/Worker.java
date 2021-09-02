package com.devsuperior.hrpayroll.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Double dailyIncome;
}
