package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.DrivingLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, String> {
}
