package ru.kai.carassemly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WheelResponse {
    private Long id;
    private String size;
}
