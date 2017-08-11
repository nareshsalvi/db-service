package com.naresh.dbservice.repository;


import org.springframework.data.repository.CrudRepository;

import com.naresh.dbservice.model.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer>{
	
}
