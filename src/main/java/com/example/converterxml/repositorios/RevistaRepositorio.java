package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Revista;


@Repository
public interface RevistaRepositorio extends JpaRepository<Revista, Long> {	    
	
}
