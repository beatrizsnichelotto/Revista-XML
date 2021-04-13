package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.DadosDeMadri;


@Repository
public interface DadosDeMadriRepositorio extends JpaRepository<DadosDeMadri, Long>{

}
