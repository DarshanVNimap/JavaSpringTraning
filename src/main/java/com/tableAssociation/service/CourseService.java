package com.tableAssociation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tableAssociation.model.Course;
import com.tableAssociation.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	
	public List<Course> getAllCourse(){
		return courseRepo.findAll();
	}
	
	public Course getCourseById(long id) {
		return courseRepo.findById(id).orElse(null);
	}
	
	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}
	
	public String removeCourse(long id) {
		courseRepo.deleteById(id);
		return "Course remove";
	}
	
	public Course updateCourse(Course course , long id) {
		
		course.setId(id);
		return  courseRepo.save(course);
	}

}
