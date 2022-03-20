package com.andorpainel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andorpainel.model.Ong;
import com.andorpainel.repository.OngRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class OngController {
	
	@Autowired
	private OngRepository ongRepository;
	
	// lista ongs
	@GetMapping("/ongs")
	public List<Ong> getAllClientes(){
		return ongRepository.findAll();
	}
	
	// consulta ong por id
	@GetMapping("/ongs/{id}")
	public ResponseEntity<Ong> consultaOngId(@PathVariable Long id){
		Ong ong = ongRepository.findById(id)
				.orElseThrow();
		return ResponseEntity.ok(ong);
	}
	
	// nova ong rest api
	@PostMapping("/ongs")
	public Ong adicionarOng(@RequestBody Ong ong) {
		return ongRepository.save(ong);
	}
	
	
	// editar ong rest api
	@PutMapping("/ongs/{id}")
	public ResponseEntity<Ong> updateOng(@PathVariable Long id, @RequestBody Ong ongDetails){
		Ong ong = ongRepository.findById(id).orElseThrow();
	
		ong.setNome(ongDetails.getNome());
		ong.setDescricao(ongDetails.getDescricao());
		ong.setSite(ongDetails.getSite());
		ong.setImagem(ongDetails.getImagem());
	
		Ong updatedOng = ongRepository.save(ong);
		return ResponseEntity.ok(updatedOng);
	}
	
	// delete ong rest api
	@DeleteMapping("/ongs/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteOng(@PathVariable Long id){
		Ong ong = ongRepository.findById(id).orElseThrow();
		ongRepository.delete(ong);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
