package com.backOffice.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
//@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private IClientService clientService;

	@GetMapping("/all")
	public ResponseEntity<List<Client>> getAllClient(){
		System.out.println("ici  jddddddddddddddddddd");
		return  new ResponseEntity<List<Client>>(clientService.getAllClient(), HttpStatus.OK);
//		HttpHeaders responseHeaders = new HttpHeaders();
//		responseHeaders.set("Access-Control-Allow-Headers", "Access-Control-Allow-Origin");
//	    responseHeaders.set("Access-Control-Allow-Origin", "*");
//	    responseHeaders.set("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
	    
//	    responseHeaders.set("Baeldung-Example-Header", "Value-ResponseEntityBuilderWithHttpHeaders");
//	    res.setHeader();
//        res.setHeader();
//	    return ResponseEntity.ok().headers(responseHeaders).body(clientService.getAllClient()) ;
	}
}
