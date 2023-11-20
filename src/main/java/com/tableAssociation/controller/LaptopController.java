package com.tableAssociation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tableAssociation.model.Laptop;
import com.tableAssociation.service.LaptopService;

@RestController
@RequestMapping("/api")
public class LaptopController {
	
	@Autowired
	private LaptopService laptopservice;
	
	@GetMapping("/laptops")
	public ResponseEntity<?> getLaptops(){
		
//		List<Laptop> lap = new ArrayList<>();
//		laptopRepo.findAll().forEach(l -> {
//			Student s = l.getStudent();
//			s.setLaptop(null);
//			lap.add(new LaptopRequest(
//					l.getId(),
//					l.getModelName(), 
//					l.getName() , 
//					s));
//		});
		
		return new ResponseEntity<>(laptopservice.getAllLaptop() ,HttpStatus.OK);
	}
	
	@GetMapping("/laptops/{id}")
	public Laptop getLaptopById(@PathVariable int id) {
		return laptopservice.getLaptopById(id);
	}
	
	@PostMapping("/laptops")
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return laptopservice.addLaptop(laptop);
	}
	
	
	@PutMapping("/laptops/{id}")
	public Laptop updateLaptop(@RequestBody Laptop laptop ,@PathVariable int id) {
		return laptopservice.updateLaptop(laptop, id);
	}
	
	@DeleteMapping("/laptops/{id}")
	public String deleteLaptop(@PathVariable int id) {
//		System.out.println(id);
		return laptopservice.removeLaptop(id);
	}
	

}
