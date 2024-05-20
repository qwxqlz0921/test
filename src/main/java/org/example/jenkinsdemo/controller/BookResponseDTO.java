package org.example.jenkinsdemo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponseDTO {
    private String id;
    private String type;
    private String name11;
    private String description;
    private BigDecimal price;
    private String userId;
}
