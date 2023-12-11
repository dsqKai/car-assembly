package ru.kai.carassemly.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kai.carassemly.model.Car;
import ru.kai.carassemly.model.CarBody;
import ru.kai.carassemly.model.Wheel;
import ru.kai.carassemly.repository.CarBodyRepository;
import ru.kai.carassemly.repository.CarRepository;
import ru.kai.carassemly.repository.WheelRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarBodyRepository carBodyRepository;
    private final WheelRepository wheelRepository;

    public Iterable<CarBody> getAllCarBody() {
        return carBodyRepository.findAll();
    }

    public Iterable<Wheel> getAllCarWheels() {
        return wheelRepository.findAll();
    }

    public Optional<Car> getCarById(String uuid) {
        return carRepository.findById(uuid);
    }

    public void createCar(Car car) {
        carRepository.save(car);
    }
}
