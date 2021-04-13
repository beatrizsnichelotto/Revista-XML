package com.example.converterxml.objetos;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.example.converterxml.metodos.DateAdapter;

@XmlRootElement(name = "dados-de-madri")
public class DadosDeMadriObj {
	
	private String numeroInscricaoInternacional; 

	private Date dataRecebimentoInpi;
		
	@XmlAttribute (name = "numero-inscricao-internacional")
	public String getNumeroInscricaoInternacional() {
		return numeroInscricaoInternacional;
	}
	
	public void setNumeroInscricaoInternacional(String numeroInscricaoInternacional) {
		this.numeroInscricaoInternacional = numeroInscricaoInternacional;
	}
	
	@XmlJavaTypeAdapter(value = DateAdapter.class)
	@XmlAttribute (name = "data-recebimento-inpi")
	public Date getDataRecebimentoInpi() {
		return dataRecebimentoInpi;
	}

	public void setDataRecebimentoInpi(Date dataRecebimentoInpi) {
		this.dataRecebimentoInpi = dataRecebimentoInpi;
	}
}
