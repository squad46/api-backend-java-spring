package com.andorpainel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andorpainel.model.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
	
	@Query(value = "select count(*) from Trabalhos where Tipo = 'CLT'", nativeQuery = true)
	long TotalClt();
	
	@Query(value = "select count(*) from Trabalhos where Tipo = 'Autônomo'", nativeQuery = true)
	long TotalAutonomo();
	
	@Query(value = "select count(*) from Trabalhos where Tipo = 'PJ'", nativeQuery = true)
	long TotalPj();
	
	@Query(value = "select count(*) from Trabalhos where Tipo = 'Temporário'", nativeQuery = true)
	long TotalTemporario();
	
}
