package com.naresh.dbservice.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.naresh.dbservice.model.Actor;


public interface ActorTestRepository extends JpaRepository<Actor, Integer>{
	List<Actor> findByFirstName(String name);
}
