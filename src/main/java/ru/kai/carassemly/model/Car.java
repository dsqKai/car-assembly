package ru.kai.carassemly.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Car {
    @Id
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "name")
    private String name;
    @Column(name = "car_body_id")
    private Long carBodyId;
    @Column(name="wheel_size_id")
    private Long wheelSizeId;
    @Column(name="wheels_count")
    private Integer wheelsCount;
    @ManyToOne
    @JoinColumn(name = "car_body_id", insertable=false, updatable=false)
    private CarBody body;
    @ManyToOne
    @JoinColumn(name = "wheel_size_id", insertable=false, updatable=false)
    private Wheel wheel;
}
