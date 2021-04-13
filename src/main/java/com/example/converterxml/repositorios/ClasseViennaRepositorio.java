package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.ClasseVienna;

@Repository
public interface ClasseViennaRepositorio extends JpaRepository<ClasseVienna, Long>{

}
