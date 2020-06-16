package com.mparszewski.carrental.controller;

import com.mparszewski.carrental.model.Address;
import com.mparszewski.carrental.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {

    @Autowired
    private AddressRepository adresRepository;

    @GetMapping("/cars")
    public void saveAdres() {
        Address address = new Address();
        address.setCountry("Polska");
        address.setCity("Warszawa");
        address.setStreetNumber("13/5");
        address.setPostalCode("02-223");
        adresRepository.save(address);
    }


    @GetMapping("/cars/save/{country}")
    public List<Address> getAllAddresses(@PathVariable String country) {
        return adresRepository.findAddressesByCountry(country);
    }
}
