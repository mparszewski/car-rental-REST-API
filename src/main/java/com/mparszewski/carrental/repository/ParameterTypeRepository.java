package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.ParameterType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterTypeRepository extends JpaRepository<ParameterType, Integer> {
}
