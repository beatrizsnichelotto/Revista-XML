package com.example.converterxml.objetos;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.converterxml.metodos.DateAdapter;

@XmlRootElement(name = "revista")
public class RevistaObj { 
   	
	private String numero;
	
	private Date data;

	private List<ProcessoObj> processo;
	
	@XmlAttribute (name = "numero")
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data")
	public Date getData(){
		return data;
	}
	
	
	public void setData(Date data) {
		this.data = data;
	}

	@XmlElement(name = "processo")
	public List<ProcessoObj> getProcesso() {
		return processo;
	}
	
	public void setProcesso(List<ProcessoObj> processo) {
		this.processo = processo;
	}
} 


