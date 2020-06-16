package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Integer> {
}
