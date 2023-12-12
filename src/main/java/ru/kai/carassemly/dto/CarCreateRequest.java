package ru.kai.carassemly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarCreateRequest {
    private String name;
    private Long carBodyId;
    private Long wheelSizeId;
    private Integer wheelsCount;
}
