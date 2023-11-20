package com.tableAssociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tableAssociation.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
