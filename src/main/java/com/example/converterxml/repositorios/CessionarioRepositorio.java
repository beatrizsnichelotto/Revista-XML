package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Cessionario;


@Repository
public interface CessionarioRepositorio extends JpaRepository<Cessionario, Long>{
	
}
