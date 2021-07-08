package com.example.policicue.service;

import java.util.List;

import com.example.policicue.model.Policicue;

public interface PolicicueService {

	Policicue retriveuser(Long id);
	List<Policicue> retrivealluser();
	void adduser(Policicue policicue);
	Policicue retriveusername(String name);
	
}
