package ru.kai.carassemly.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kai.carassemly.model.CarBody;

@Repository
public interface CarBodyRepository extends CrudRepository<CarBody, Long> {
}
