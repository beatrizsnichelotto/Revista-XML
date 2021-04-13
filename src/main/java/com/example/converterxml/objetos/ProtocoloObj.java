package com.example.converterxml.objetos;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.converterxml.metodos.DateAdapter;

@XmlRootElement(name = "protocolo")
public class ProtocoloObj {

	private String numero;
	
	private Date data;
	
	private String codigoServico;
	
	private String procurador;
	
	private List<CedenteObj> cedente;
	
	private List<CessionarioObj> cessionario;
	
	private RequerenteObj requerente;	
	
	@XmlAttribute (name = "numero")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data")
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}

	@XmlAttribute (name = "codigoServico")
	public String getCodigoServico() {
		return codigoServico;
	}
	
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	
	@XmlElement(name = "requerente")
	public RequerenteObj getRequerente() {
		return requerente;
	}
	
	public void setRequerente(RequerenteObj requerente) {
		this.requerente = requerente;
	}

	@XmlElement(name = "procurador")
	public String getProcurador() {
		return procurador;
	}    
        
	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}

	@XmlElementWrapper(name = "cedentes")
	@XmlElement(name = "cedente")
	public List<CedenteObj> getCedente() {
		return cedente;
	}
	
	public void setCedente(List<CedenteObj> cedente) {
		this.cedente = cedente;
	}

	@XmlElementWrapper(name = "cessionarios")
	@XmlElement(name = "cessionario")
	public List<CessionarioObj> getCessionario() {
		return cessionario;
	}
	
	public void setCessionario(List<CessionarioObj> cessionario) {
		this.cessionario = cessionario;
	}
}
