package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.CarParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarParameterRepository extends JpaRepository<CarParameter, Integer> {
}
