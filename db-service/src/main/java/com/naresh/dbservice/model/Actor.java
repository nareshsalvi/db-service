package com.naresh.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor", catalog = "sakila")
public class Actor {

	@Id  
	@Column(name="actor_id")
	private Integer id;
	
	 @Column(name = "first_name")
	private String firstName;
	
	 @Column(name = "last_name")
	 private String lastName;
	public Actor() {
		
	}
	
	public Actor( String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	
}
