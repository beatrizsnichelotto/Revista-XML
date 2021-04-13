package com.example.converterxml.objetos;

import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.converterxml.metodos.DateAdapter;

@XmlRootElement(name = "prioridade")
public class PrioridadeObj {

	private Date data;

	private String numero;

	private String pais;
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data")
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@XmlAttribute (name = "numero")
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@XmlAttribute (name = "pais")
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
}
