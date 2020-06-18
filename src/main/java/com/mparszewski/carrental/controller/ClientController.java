package com.mparszewski.carrental.controller;

import com.mparszewski.carrental.dto.ClientDTO;
import com.mparszewski.carrental.model.Client;
import com.mparszewski.carrental.repository.ClientRepository;
import com.mparszewski.carrental.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable int id) {
        return clientRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @PutMapping("/clients")
    public void updateClient(@RequestBody ClientDTO clientDTO) {
        clientService.saveClient(clientDTO);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable int id) {
        clientRepository
                .findById(id)
                .ifPresent(client -> clientRepository.delete(client));
    }
}
