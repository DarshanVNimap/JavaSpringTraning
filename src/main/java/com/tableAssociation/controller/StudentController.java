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

import com.tableAssociation.model.Student;
import com.tableAssociation.service.studentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private studentService service;
	
	@GetMapping("/students")
	public ResponseEntity<?> getStudent(){
		return new ResponseEntity<>(service.getAllStudent() , HttpStatus.OK);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public String removeStudent(@PathVariable int id) {
		return service.removeStudent(id);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@RequestBody Student student , @PathVariable int id) {
		return service.updateStudent(student, id);
	}
	
	

}
