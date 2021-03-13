package com.backOffice.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backOffice.api.entities.Client;
import com.backOffice.api.services.IClientService;


@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private IClientService clientService;

	@GetMapping("/all")
	public ResponseEntity<List<Client>> getAllClient(){
		System.out.println("ici  jddddddddddddddddddd");
		ResponseEntity<List<Client>> re = new ResponseEntity<List<Client>>(clientService.getAllClient(), HttpStatus.OK);
		re.getHeaders().set("Access-Control-Allow-Origin","*");
		return re ;
	}
}
