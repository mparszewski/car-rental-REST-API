package com.mparszewski.carrental.dto;

import com.mparszewski.carrental.model.Client;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO extends Client {

    private int addressId;
}
