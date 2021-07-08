package com.example.policicue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.policicue.model.Policicue;
import com.example.policicue.repository.PolicicueRepository;

@Service
public class PolicicueServiceImpl implements PolicicueService {

	@Autowired
	private PolicicueRepository policicueRepository;

	

	@Override
	public List<Policicue> retrivealluser() {
		return policicueRepository.findAll();
	}

	@Override
	public void adduser(Policicue policicue) {
		policicueRepository.save(policicue);
	}

	@Override
	public Policicue retriveuser(Long id) {
		Optional<Policicue> policicue = policicueRepository.findById(id);
		if(policicue.isPresent()) {
			return policicue.get();
		}
		throw new RuntimeException("This details was not found for this id: "+id);
	}

	@Override
	public Policicue retriveusername(String name) {
		Optional<Policicue> policicue = Optional.of(policicueRepository.findByName(name));
		if(policicue.isPresent()) {
			return policicue.get();	
		}
		Policicue li = policicue.get();
		return li;
		
	}
	
	
	

}
