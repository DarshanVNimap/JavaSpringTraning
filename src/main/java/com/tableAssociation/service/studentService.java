package com.tableAssociation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tableAssociation.model.Student;
import com.tableAssociation.repository.StudentRepo;

@Service
public class studentService {
	
	@Autowired
	private StudentRepo repository;
    
	public List<Student> getAllStudent(){
		return repository.findAll();
	}
	
	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Student addStudent(Student student) {
		return repository.save(student);
	}
	
	public String removeStudent(int id) {
		repository.deleteById(id);
		return "remove";
	}
	
	public Student updateStudent(Student student , int id) {
		student.setId(id);
		return  repository.save(student);
	}
	
}
