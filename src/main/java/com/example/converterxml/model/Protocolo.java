package com.example.converterxml.model;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Protocolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private String numero;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data")
	private Date data;
	
	@Column(name = "codigoServico")
	private String codigoServico;
	
	@Column(name = "procurador")
	private String procurador;
	
	@OneToMany(mappedBy = "protocolo")
	private List<Cedente> cedente;
	
	@OneToMany(mappedBy = "protocolo")
	private List<Cessionario> cessionario;
	
	@OneToOne
	private Requerente requerente;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCodigoServico() {
		return codigoServico;
	}
	public void setCodigoServico(String codigoServico) {
		this.codigoServico = codigoServico;
	}
	public String getProcurador() {
		return procurador;
	}
	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}
	public List<Cedente> getCedente() {
		return cedente;
	}
	public void setCedente(List<Cedente> cedente) {
		this.cedente = cedente;
	}
	public List<Cessionario> getCessionario() {
		return cessionario;
	}
	public void setCessionario(List<Cessionario> cessionario) {
		this.cessionario = cessionario;
	}
	public Requerente getRequerente() {
		return requerente;
	}
	public void setRequerente(Requerente requerente) {
		this.requerente = requerente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Protocolo other = (Protocolo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
}
