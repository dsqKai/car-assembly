package ru.kai.carassemly.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kai.carassemly.dto.CarBodyResponse;
import ru.kai.carassemly.dto.CarCreateRequest;
import ru.kai.carassemly.dto.CarResponse;
import ru.kai.carassemly.dto.WheelResponse;
import ru.kai.carassemly.model.Car;
import ru.kai.carassemly.service.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CarController {
    private final CarService carService;
    private final ModelMapper modelMapper;

    @GetMapping("/getAllCarBody")
    public List<CarBodyResponse> getAllCarBody() {
        return carService.getAllCarBody().stream().map(it -> modelMapper.map(it, CarBodyResponse.class)).toList();
    }

    @GetMapping("/getAllCarWheels")
    public List<WheelResponse> getAllCarWheels() {
        return carService.getAllCarWheels().stream().map(it -> modelMapper.map(it, WheelResponse.class)).toList();
    }

    @GetMapping("/getCars")
    public List<CarResponse> getCars(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {

        return carService.getCars(PageRequest.of(page, size))
                .stream().map(it -> modelMapper.map(it, CarResponse.class)).toList();
    }

    @GetMapping("/getCarById")
    public Optional<CarResponse> getCarById(@RequestParam String id) {
        Optional<Car> car = carService.getCarById(id);
        return car.map(value -> modelMapper.map(value, CarResponse.class));
    }

    @PostMapping("/createCar")
    public ResponseEntity<HttpStatus> getCreateCar(@RequestBody CarCreateRequest carCreateRequest) {
        if (carService.getCarBodyById(carCreateRequest.getCarBodyId()).isPresent()
                && carService.getWheelById(carCreateRequest.getCarBodyId()).isPresent()
                && carCreateRequest.getWheelsCount() > 1) {
            carService.createCar(modelMapper.map(carCreateRequest, Car.class));
            return ResponseEntity.ok(HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }

}
