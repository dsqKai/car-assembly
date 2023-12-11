package ru.kai.carassemly.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class CarBody {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;
    @NonNull
    private String type;
    @OneToMany(mappedBy = "carBody")
    @JsonIgnore
    private List<Car> cars;
}
