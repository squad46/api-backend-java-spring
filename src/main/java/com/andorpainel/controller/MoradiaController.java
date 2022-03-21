package com.andorpainel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andorpainel.model.Moradia;
import com.andorpainel.repository.MoradiaRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class MoradiaController {
	
	@Autowired
	private MoradiaRepository moradiaRepository;
	
	// lista ongs
	@GetMapping("/moradias")
	public List<Moradia> getAllMoradias(){
		return moradiaRepository.findAll();
	}
}
