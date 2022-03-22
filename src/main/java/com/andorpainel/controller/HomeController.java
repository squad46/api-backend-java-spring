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
import com.andorpainel.repository.PessoaRepository;
import com.andorpainel.repository.TrabalhoRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired private PessoaRepository pessoaRepository;
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
	    Long tPessoas = pessoaRepository.count();
	    Long tPessoasMasc = pessoaRepository.TotalMasc();
	    Long tPessoasFem =	pessoaRepository.TotalFem();	
	    Long tPessoasOutros = tPessoas - tPessoasMasc - tPessoasFem;
	    Long tPessoasMascPercent = (tPessoasMasc*100)/tPessoas;
	    Long tPessoasFemPercent = (tPessoasFem*100)/tPessoas;
	    Long tPessoasOutrosPercent = (tPessoasOutros*100)/tPessoas;
	    
	    	
	    Long tOngs = ongRepository.count();
	    
	    Long tMoradias = moradiaRepository.count();
	    Long tMoradiasAp = moradiaRepository.TotalApartamento();
	    Long tMoradiasCasa = moradiaRepository.TotalCasa();
	    Long tMoradiasQuarto = moradiaRepository.TotalQuarto();
	    
	    Long tEmpregos = trabalhoRepository.count();
	    Long tEmpregosClt = trabalhoRepository.TotalClt();
	    Long tEmpregosAutonomo = trabalhoRepository.TotalAutonomo();
	    Long tEmpregosPj = trabalhoRepository.TotalPj();
	    Long tEmpregosTemp = trabalhoRepository.TotalTemporario();
	    
	    map.put("id", (long) 1);
	    
	    map.put("pessoas", tPessoas);
	    map.put("pessoasHomens", tPessoasMasc);
	    map.put("pessoasMulheres", tPessoasFem);
	    map.put("pessoasOutros", tPessoasOutros);
	    map.put("pessoasHomensPercent", tPessoasMascPercent);
	    map.put("pessoasMulheresPercent", tPessoasFemPercent);
	    map.put("pessoasOutrosPercent", tPessoasOutrosPercent);
	    
	    
	    map.put("ongs", tOngs);
	    
	    map.put("moradias", tMoradias);
	    map.put("moradiasApartamentos", tMoradiasAp);
	    map.put("moradiasCasas", tMoradiasCasa);
	    map.put("moradiasQuarto", tMoradiasQuarto);
	    
	    map.put("empregos", tEmpregos);
	    map.put("empregosClt", tEmpregosClt);
	    map.put("empregosAutonomo", tEmpregosAutonomo);
	    map.put("empregosPj", tEmpregosPj);
	    map.put("empregosTemporario", tEmpregosTemp);
	    
	    return map;
	} 
	
}
