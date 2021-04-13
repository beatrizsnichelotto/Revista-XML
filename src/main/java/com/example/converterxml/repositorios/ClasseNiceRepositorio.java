package com.example.converterxml.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.converterxml.model.ClasseNice;

@Repository
public interface ClasseNiceRepositorio extends JpaRepository<ClasseNice, Long>{

}
