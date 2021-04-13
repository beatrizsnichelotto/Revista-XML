package com.example.converterxml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.converterxml.metodos.XMLParaObjeto;

@RestController
@RequestMapping("/importar")
public class ImportarController {
	
	@Autowired
	private XMLParaObjeto xmlParaObjeto;
	
	@GetMapping
    public void execute() {
		xmlParaObjeto.transformXMLToObject();
	}
}
