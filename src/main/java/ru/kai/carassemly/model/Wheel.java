package ru.kai.carassemly.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Wheel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String size;
    @OneToMany(mappedBy = "wheel")
    private List<Car> cars;
}
