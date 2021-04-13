package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Titular;

@Repository
public interface TitularRepositorio extends JpaRepository<Titular, Long>{

}
