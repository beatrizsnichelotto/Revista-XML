package com.example.converterxml.objetos;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "classe-nacional")
public class ClasseNacionalObj {

	private String codigo;

	private String especificacao;

	private List<SubClasseNacionalObj> subClassesNacional;

	@XmlAttribute(name = "codigo")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@XmlElement(name = "especificacao")
	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	@XmlElementWrapper(name = "sub-classes-nacional")
	@XmlElement(name = "sub-classe-nacional")
	public List<SubClasseNacionalObj> getSubClassesNacional() {
		return subClassesNacional;
	}

	public void setSubClassesNacional(List<SubClasseNacionalObj> subClassesNacional) {
		this.subClassesNacional = subClassesNacional;
	}

}
