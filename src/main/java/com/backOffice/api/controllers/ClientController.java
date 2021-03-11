package com.backOffice.api.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private IClientService clientService;

	@GetMapping("/all")
	public ResponseEntity<List<Client>> getAllClient(){
		System.out.println("ici  jddddddddddddddddddd");
		HttpHeaders responseHeaders = new HttpHeaders();
//		HttpServletRequest request = (HttpServletRequest) request;
		responseHeaders.set("Access-Control-Allow-Origin","origin-list");
		responseHeaders.set("Access-Control-Allow-Credentials", "true");
		responseHeaders.set("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		responseHeaders.set("Access-Control-Max-Age", "3600");
		responseHeaders.set("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
		return ResponseEntity.ok().headers(responseHeaders).body(clientService.getAllClient());
//		return new ResponseEntity<List<Client>>(clientService.getAllClient(), HttpStatus.OK);
	}
}
