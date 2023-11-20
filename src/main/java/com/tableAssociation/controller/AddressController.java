package com.tableAssociation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tableAssociation.model.Address;
import com.tableAssociation.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@PostMapping("/address")
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address); 
	}
	
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public Address getAddressById(@PathVariable long id) {
		return addressService.getAddressById(id);
	}
	
	@DeleteMapping("/address/{id}")
	public String removeAddress(@PathVariable long id) {
		return addressService.removeAddress(id);
	}
	
	@PutMapping("/address/{id}")
	public Address updateAddress(@RequestBody Address address ,@PathVariable long id) {
		return  addressService.updateAddress(address, id);
	}
}
