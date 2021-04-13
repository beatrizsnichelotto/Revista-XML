package com.example.converterxml.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class ClasseNice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "especificacao")
	@Size(max = 8000)
	private String especificacao;
	
	@Column(name = "traducaoEspecificacao")
	@Size(max = 8000)
	private String traducaoEspecificacao;
	
	@Column(name = "status")
	private String status;
	
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

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getTraducaoEspecificacao() {
		return traducaoEspecificacao;
	}

	public void setTraducaoEspecificacao(String traducaoEspecificacao) {
		this.traducaoEspecificacao = traducaoEspecificacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		ClasseNice other = (ClasseNice) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
