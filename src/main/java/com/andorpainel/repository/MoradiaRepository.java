package com.andorpainel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andorpainel.model.Moradia;

public interface MoradiaRepository extends JpaRepository<Moradia, Long>{
	
	@Query(value = "select count(*) from Moradias where Tipo = 'Apartamento'", nativeQuery = true)
	long TotalApartamento();
	
	@Query(value = "select count(*) from Moradias where Tipo = 'Casa'", nativeQuery = true)
	long TotalCasa();
	
	@Query(value = "select count(*) from Moradias where Tipo = 'Quarto'", nativeQuery = true)
	long TotalQuarto();

}
