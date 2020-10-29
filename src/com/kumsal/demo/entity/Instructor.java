package com.kumsal.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	private int id;
	
	private String lastName;
	
	private String firstName;
	
	private String email;
	
}
