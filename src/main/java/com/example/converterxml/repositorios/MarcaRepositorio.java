package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Marca;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long>{

}
