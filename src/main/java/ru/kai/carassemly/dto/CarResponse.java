package ru.kai.carassemly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarResponse {
    private String uuid;
    private String name;
    private CarBodyResponse body;
    private WheelResponse wheel;
    private Integer wheelsCount;
}
