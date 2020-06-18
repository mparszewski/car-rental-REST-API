package com.mparszewski.carrental.service;

import com.mparszewski.carrental.dto.DrivingLicenseDTO;
import com.mparszewski.carrental.model.DrivingLicense;
import com.mparszewski.carrental.repository.ClientRepository;
import com.mparszewski.carrental.repository.DrivingLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrivingLicenseService {

    @Autowired
    private DrivingLicenseRepository drivingLicenseRepository;

    @Autowired
    private ClientRepository clientRepository;

    public void saveDrivingLicense(DrivingLicenseDTO drivingLicenseDTO) {
        DrivingLicense drivingLicense = drivingLicenseDTO.createDrivingLicense();
        clientRepository.findById(drivingLicenseDTO.getClientId())
                .ifPresent(drivingLicense::setClient);
        drivingLicenseRepository.save(drivingLicense);
    }
}
