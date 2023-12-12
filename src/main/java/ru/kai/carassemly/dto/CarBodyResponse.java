package ru.kai.carassemly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarBodyResponse {
    private Long id;
    private String type;
}
