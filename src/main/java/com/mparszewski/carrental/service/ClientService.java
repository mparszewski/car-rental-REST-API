package com.mparszewski.carrental.service;

import com.mparszewski.carrental.dto.ClientDTO;
import com.mparszewski.carrental.model.Client;
import com.mparszewski.carrental.repository.AddressRepository;
import com.mparszewski.carrental.repository.ClientRepository;
import com.mparszewski.carrental.repository.DrivingLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Optional.*;

@Service
public class ClientService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private DrivingLicenseRepository drivingLicenseRepository;

    public void saveClient(ClientDTO clientDTO) {
        Client client = clientDTO.createClient();
        addressRepository.findById(clientDTO.getAddressId())
                .ifPresent(client::setAddress);
        ofNullable(clientDTO.getDrivingLicenseId())
                .flatMap(drivingLicenseRepository::findById)
                .ifPresent(client::setDrivingLicense);
        clientRepository.save(client);
    }
}
