package com.tableAssociation.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String std;
	private String email;

	@OneToOne(mappedBy = "student" , cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	private Laptop laptop;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "student" ,fetch = FetchType.LAZY )
	private List<Course> course;
	
	@JsonIgnore
	@OneToMany(mappedBy = "student" ,fetch = FetchType.LAZY )
	private List<Address> address; 
	
	
	
	

}
