package com.tableAssociation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tableAssociation.model.Address;
import com.tableAssociation.repository.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;

	public List<Address> getAllAddress(){
		return addressRepo.findAll();
	}
	
	public Address getAddressById(long id) {
		return addressRepo.findById(id).orElse(null);
	}
	
	public Address addAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public String removeAddress(long id) {
		addressRepo.deleteById(id);
		return "Remove address";
	}
	
	public Address updateAddress(Address address , long id) {
		address.setId(id);
		return  addressRepo.save(address);
	}
}
