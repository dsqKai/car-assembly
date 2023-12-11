package ru.kai.carassemly.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kai.carassemly.model.Car;
import ru.kai.carassemly.model.CarBody;
import ru.kai.carassemly.model.Wheel;
import ru.kai.carassemly.service.CarService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/getAllCarBody")
    public Iterable<CarBody> getAllCarBody() {
        return carService.getAllCarBody();
    }

    @GetMapping("/getAllCarWheels")
    public Iterable<Wheel> getAllCarWheels() {
        return carService.getAllCarWheels();
    }

    @GetMapping("/getCarById/{uuid}")
    public Optional<Car> getCarById(@PathVariable String uuid) {
        return carService.getCarById(uuid);
    }

    @PostMapping("/createCar")
    public void getCarById(@RequestBody Car car) {
        carService.createCar(car);
    }

}
