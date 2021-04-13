package com.example.converterxml.objetos;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sobrestador")
public class SobrestadorObj {
	
	private String processo;
	
	private String marca;
	
	@XmlAttribute (name = "processo")
	public String getProcesso() {
		return processo;
	}
	
	public void setProcesso(String processo) {
		this.processo = processo;
	}

	@XmlAttribute (name = "marca")
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
