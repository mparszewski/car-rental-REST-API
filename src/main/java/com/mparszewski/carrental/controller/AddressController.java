package com.mparszewski.carrental.controller;

import com.mparszewski.carrental.model.Address;
import com.mparszewski.carrental.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/address")
    public void createAddress(@RequestBody Address address) {
        addressRepository.save(address);
    }
}
