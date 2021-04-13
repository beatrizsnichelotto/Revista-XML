package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Sobrestador;

@Repository
public interface SobrestadorRepositorio extends JpaRepository<Sobrestador, Long>{
	
}
