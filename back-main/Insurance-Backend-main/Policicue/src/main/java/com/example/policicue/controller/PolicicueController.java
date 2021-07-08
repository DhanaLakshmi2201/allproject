package com.example.policicue.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.policicue.model.Policicue;
import com.example.policicue.repository.PolicicueRepository;
import com.example.policicue.service.PolicicueServiceImpl;

@RestController
public class PolicicueController {
	@Autowired
	private PolicicueRepository policicueRepository;
	
	@Autowired
	private PolicicueServiceImpl policicueServiceImpl;
	
	@GetMapping("/users")  
	public List<Policicue> retriveAllUsers()  
	{  
	return policicueServiceImpl.retrivealluser();  
	}  
	@GetMapping("/users/{id}")  
	public ResponseEntity<Policicue> retriveuser(@PathVariable("id")Long id){
		return new ResponseEntity<Policicue>(policicueServiceImpl.retriveuser(id),HttpStatus.OK);
	}  
	
	@GetMapping("/users/aa/{name}")
	public ResponseEntity<Policicue> retriveusername (@PathVariable("name")String name){
		return new ResponseEntity<Policicue>(policicueServiceImpl.retriveusername(name),HttpStatus.OK);
	}
	@PostMapping("/users")  
	public void adduser(@RequestBody Policicue policicue)  
	{  
	policicueServiceImpl.adduser(policicue);    
	}  
	
	//@SuppressWarnings("unused")
	@GetMapping("/users/bb/{name}")
	public List<Policicue> countuser(@PathVariable("name") String name){
		System.out.println("hii");
		Policicue obj =  (Policicue) policicueRepository.findAll();
		System.out.println("3");
		for(long i = 0;i<6;i++) {
			System.out.println("4");
			if(i==obj.getId()) {
		
				String names=obj.getName();
				if(name==names) {
					System.out.println(names);
				}
			}
			
		}
		
	
		
		return null;
		
	}
}


