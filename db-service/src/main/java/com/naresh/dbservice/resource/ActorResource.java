package com.naresh.dbservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.dbservice.model.Actor;
import com.naresh.dbservice.repository.ActorRepository;


@RestController
@RequestMapping("/actor")
public class ActorResource {
	@Autowired
	ActorRepository actorRepository;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Iterable<Actor> getAll(){		
		return actorRepository.findAll();				
	}

}
