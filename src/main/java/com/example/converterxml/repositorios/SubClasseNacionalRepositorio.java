package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.SubClasseNacional;

@Repository
public interface SubClasseNacionalRepositorio extends JpaRepository<SubClasseNacional, Long>{
	
}
