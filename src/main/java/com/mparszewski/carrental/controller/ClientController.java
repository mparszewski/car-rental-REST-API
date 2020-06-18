package com.mparszewski.carrental.controller;

import com.mparszewski.carrental.dto.ClientDTO;
import com.mparszewski.carrental.repository.ClientRepository;
import com.mparszewski.carrental.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientService clientService;

    @PostMapping("/clients")
    public void createClient(@RequestBody ClientDTO client) {
        clientService.saveClient(client);
    }
}
