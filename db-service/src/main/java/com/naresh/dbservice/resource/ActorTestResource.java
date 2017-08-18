package com.naresh.dbservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.dbservice.model.Actor;
import com.naresh.dbservice.repository.ActorTestRepository;


@RestController
@RequestMapping("/actor")
public class ActorTestResource {
	@Autowired
	ActorTestRepository actorRepository;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Iterable<Actor> getAll(){		
		return actorRepository.findAll();				
	}
	
	@GetMapping("/{name}")
	public List<Actor> getActor(@PathVariable("name")String name ){		
			return actorRepository.findByFirstName(name);		
		//	return null;
	}

}
