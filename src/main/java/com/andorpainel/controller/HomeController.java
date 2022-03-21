package com.andorpainel.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andorpainel.repository.MoradiaRepository;
import com.andorpainel.repository.OngRepository;
import com.andorpainel.repository.TrabalhoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private OngRepository ongRepository;
	
	@Autowired
	private MoradiaRepository moradiaRepository;
	
	@Autowired 
	private TrabalhoRepository trabalhoRepository;
	
	
	// estatisticas
	@GetMapping("/estatisticas")
	public Long Total()
	{
		return ongRepository.count();
	}
	
	@GetMapping("/stats")
	public Map<String, Long> Stats() {
	    HashMap<String, Long> map = new HashMap<>();
	    Long tOngs = ongRepository.count();
	    Long tMoradias = moradiaRepository.count();
	    Long tEmpregos = trabalhoRepository.count();
	    map.put("ongs", tOngs);
	    map.put("moradias", tMoradias);
	    map.put("empregos", tEmpregos);
	    return map;
	} 
	
}
