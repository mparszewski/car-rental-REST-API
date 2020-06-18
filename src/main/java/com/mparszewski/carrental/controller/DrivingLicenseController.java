package com.mparszewski.carrental.controller;

import com.mparszewski.carrental.dto.DrivingLicenseDTO;
import com.mparszewski.carrental.model.DrivingLicense;
import com.mparszewski.carrental.repository.DrivingLicenseRepository;
import com.mparszewski.carrental.service.DrivingLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DrivingLicenseController {

    @Autowired
    private DrivingLicenseRepository drivingLicenseRepository;

    @Autowired
    private DrivingLicenseService drivingLicenseService;

    @GetMapping("license/{id}")
    public DrivingLicense getByDrivingLicenseId(@PathVariable String id) {
        return drivingLicenseRepository.findById(id).orElseThrow(IllegalAccessError::new);
    }

    @PutMapping("/license")
    public void createDrivingLicense(@RequestBody DrivingLicenseDTO drivingLicenseDTO) {
        drivingLicenseService.saveDrivingLicense(drivingLicenseDTO);
    }
}
