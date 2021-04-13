package com.example.converterxml.model;

import javax.persistence.*;

@Entity
public class Sobrestador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "processo_sobrestador")
	private String processo_sobrestador;
	
	@Column(name = "marca")
	private String marca;
	
	@ManyToOne
	private Processo processo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcesso_sobrestador() {
		return processo_sobrestador;
	}

	public void setProcesso_sobrestador(String processo_sobrestador) {
		this.processo_sobrestador = processo_sobrestador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
		Sobrestador other = (Sobrestador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
