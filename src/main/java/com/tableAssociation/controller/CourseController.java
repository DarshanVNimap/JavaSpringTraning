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

import com.tableAssociation.model.Course;
import com.tableAssociation.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course); 
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
	
	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable long id) {
		return courseService.getCourseById(id);
	}
	
	@DeleteMapping("/course/{id}")
	public String removeCourse(@PathVariable long id) {
		return courseService.removeCourse(id);
	}
	
	@PutMapping("/course/{id}")
	public Course updateCourse(@RequestBody Course course ,@PathVariable long id) {
		return  courseService.updateCourse(course, id);
	}


}
