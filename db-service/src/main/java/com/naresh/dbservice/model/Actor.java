package com.naresh.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actor", catalog = "sakila")
public class Actor {

	@Id  
	private Integer actor_id;
	
	 @Column(name = "first_name")
	private String first_name;
	
	 @Column(name = "last_name")
	 private String last_name;
	public Actor() {
		
	}
	public Actor(int actor_id, String first_name, String last_name) {
		super();
		this.actor_id = actor_id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	
}
