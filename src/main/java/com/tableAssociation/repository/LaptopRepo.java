package com.tableAssociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tableAssociation.model.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer>{

//	@Query(value = "select l.id,l.model_name,l.name, s.name , s.email from laptop l\r\n"
//			+ "join student s\r\n"
//			+ "on l.student_id = s.id" , nativeQuery = true )
//	public List<LaptopRequest> getAll();
}
