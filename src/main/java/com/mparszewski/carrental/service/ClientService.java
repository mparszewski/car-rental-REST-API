package com.mparszewski.carrental.service;

import com.mparszewski.carrental.dto.ClientDTO;
import com.mparszewski.carrental.model.Address;
import com.mparszewski.carrental.model.Client;
import com.mparszewski.carrental.repository.AddressRepository;
import com.mparszewski.carrental.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ClientRepository clientRepository;

    public void saveClient(ClientDTO clientDTO) {
        Address address = addressRepository.getOne(clientDTO.getAddressId());
        clientDTO.setAddress(address);
        clientRepository.save((Client) clientDTO);
    }
}
