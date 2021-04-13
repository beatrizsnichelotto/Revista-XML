package com.example.converterxml.objetos;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sub-classe-nacional")
public class SubClasseNacionalObj {

	private String codigo;

	@XmlAttribute(name = "codigo")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
