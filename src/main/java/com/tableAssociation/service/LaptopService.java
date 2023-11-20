package com.tableAssociation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tableAssociation.model.Laptop;
import com.tableAssociation.repository.LaptopRepo;

@Service	
public class LaptopService {
	
	@Autowired
	private LaptopRepo repository;
	
	public List<Laptop> getAllLaptop(){
		return repository.findAll();
	}
	
	public Laptop getLaptopById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Laptop addLaptop(Laptop laptop) {
		return repository.save(laptop);
	}
	
	public String removeLaptop(int id) {
		repository.deleteById(id);
		return "Laptop remove";
	}
	
	public Laptop updateLaptop(Laptop laptop , int id) {
		laptop.setId(id);
		return  repository.save(laptop);
	}

}
