package ru.kai.carassemly.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kai.carassemly.model.Wheel;

@Repository
public interface WheelRepository extends CrudRepository<Wheel, Long> {
}
