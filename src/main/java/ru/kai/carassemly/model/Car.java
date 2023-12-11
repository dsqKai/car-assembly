package ru.kai.carassemly.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@Data
public class Car {
    @Id
    @NonNull
    @Column(name = "uuid")
    private String uuid;
    @NonNull
    @JsonIgnore
    @Column(name = "car_body_id")
    private Long carBodyId;
    @NonNull
    @JsonIgnore
    @Column(name="wheel_size_id")
    private Long wheelSizeId;
    @NonNull
    @Column(name="wheels_count")
    private Integer wheelsCount;
    @ManyToOne
    @JoinColumn(name = "car_body_id", insertable=false, updatable=false)
    private CarBody carBody;
    @ManyToOne
    @JoinColumn(name = "wheel_size_id", insertable=false, updatable=false)
    private Wheel wheel;
}
