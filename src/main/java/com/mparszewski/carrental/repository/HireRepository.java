package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.Hire;
import com.mparszewski.carrental.model.HireId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HireRepository extends JpaRepository<Hire, HireId> {
}
