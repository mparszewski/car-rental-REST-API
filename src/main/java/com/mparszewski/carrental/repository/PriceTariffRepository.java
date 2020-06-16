package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.PriceTariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceTariffRepository extends JpaRepository<PriceTariff, Double> {
}
