package ru.kai.carassemly.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.kai.carassemly.model.Car;

@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, String>, CrudRepository<Car, String> {
}
