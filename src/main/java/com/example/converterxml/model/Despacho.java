package com.example.converterxml.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Despacho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "textoComplementar")
	@Size(max=8000)
	private String textoComplementar;
	
	@Column(name = "textoSobrestamento")
	@Size(max=8000)
	private String textoSobrestamento;
	
	@OneToOne
	private Protocolo protocolo;	
	
	@ManyToOne
	private Processo processo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTextoComplementar() {
		return textoComplementar;
	}

	public void setTextoComplementar(String textoComplementar) {
		this.textoComplementar = textoComplementar;
	}

	public String getTextoSobrestamento() {
		return textoSobrestamento;
	}

	public void setTextoSobrestamento(String textoSobrestamento) {
		this.textoSobrestamento = textoSobrestamento;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
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
		Despacho other = (Despacho) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
