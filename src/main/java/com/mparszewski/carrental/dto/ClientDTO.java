package com.mparszewski.carrental.dto;

import com.mparszewski.carrental.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private int clientId;
    private String password;
    private String firstName;
    private String lastName;
    private String pesel;
    private String emailAddress;
    private String phoneNumber;
    private String name;
    private String nip;
    private String trade;
    private String drivingLicenseId;
    private int addressId;


    public Client createClient() {
        Client client = new Client();
        client.setClientId(this.clientId);
        client.setFirstName(this.firstName);
        client.setLastName(this.lastName);
        client.setPassword(this.password);
        client.setEmailAddress(this.emailAddress);
        client.setName(this.name);
        client.setNip(this.nip);
        client.setPesel(this.pesel);
        client.setPhoneNumber(this.phoneNumber);
        client.setTrade(this.trade);
        return client;
    }
}
