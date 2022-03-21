package com.andorpainel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andorpainel.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	@Query(value = "select count(*) from Pessoas where Sexo = 'M'", nativeQuery = true)
	long TotalMasc();
	
	@Query(value = "select count(*) from Pessoas where Sexo = 'F'", nativeQuery = true)
	long TotalFem();
	
}
