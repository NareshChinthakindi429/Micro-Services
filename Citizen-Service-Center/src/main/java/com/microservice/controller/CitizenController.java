package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.Citizen;
import com.microservice.repo.CitizenRepository;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepository repo;
	
	
	@PostMapping("/save")
	public Citizen addCitizen(@RequestBody Citizen citizen) {
		
		Citizen saveCitizen=repo.save(citizen);
		return saveCitizen;
	}
	
	@GetMapping("/get/{id}")
	public List<Citizen> getCitizen(@PathVariable  int id){
		
		List<Citizen> getAll=repo.findByVaccinationcenterid(id);
		return getAll;
		
	}

}
