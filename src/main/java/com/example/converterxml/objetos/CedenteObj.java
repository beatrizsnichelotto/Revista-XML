package com.example.converterxml.objetos;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cedente")
public class CedenteObj {
	
	private String nomeRazaoSocial;
	
	private String pais;

	@XmlAttribute (name = "nome-razao-social")
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}
	
	@XmlAttribute (name = "pais")
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}	
}
