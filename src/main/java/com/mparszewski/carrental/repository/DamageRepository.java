package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DamageRepository extends JpaRepository<Damage, Integer> {
}
