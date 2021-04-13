package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Processo;

@Repository
public interface ProcessoRepositorio extends JpaRepository<Processo, Long> {    
	
}
