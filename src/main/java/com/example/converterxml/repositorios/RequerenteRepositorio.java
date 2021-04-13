package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.Requerente;


@Repository
public interface RequerenteRepositorio extends JpaRepository<Requerente, Long>{

}
