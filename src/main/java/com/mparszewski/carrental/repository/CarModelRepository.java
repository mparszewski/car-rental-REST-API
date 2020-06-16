package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, String> {
}
