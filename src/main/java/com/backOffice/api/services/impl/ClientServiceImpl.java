package com.backOffice.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backOffice.api.entities.Client;
import com.backOffice.api.repositories.ClientRepository;
import com.backOffice.api.services.IClientService;

@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	private ClientRepository clientRepository;

	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}

}
