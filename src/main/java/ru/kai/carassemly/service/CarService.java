package ru.kai.carassemly.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kai.carassemly.model.Car;
import ru.kai.carassemly.model.CarBody;
import ru.kai.carassemly.model.Wheel;
import ru.kai.carassemly.repository.CarBodyRepository;
import ru.kai.carassemly.repository.CarRepository;
import ru.kai.carassemly.repository.WheelRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarBodyRepository carBodyRepository;
    private final WheelRepository wheelRepository;

    public List<CarBody> getAllCarBody() {
        return (List<CarBody>) carBodyRepository.findAll();
    }

    public List<Wheel> getAllCarWheels() {
        return (List<Wheel>) wheelRepository.findAll();
    }

    public List<Car> getCars(PageRequest pageRequest) {
        return carRepository.findAll(pageRequest).getContent();
    }

    public Optional<Car> getCarById(String uuid) {
        return carRepository.findById(uuid);
    }

    public Optional<CarBody> getCarBodyById(Long id) {
        return carBodyRepository.findById(id);
    }

    public Optional<Wheel> getWheelById(Long id) {
        return wheelRepository.findById(id);
    }

    public void createCar(Car car) {
        if (car.getUuid() == null) {
            car.setUuid(UUID.randomUUID().toString());
        }
        carRepository.save(car);
    }
}
