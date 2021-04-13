package com.example.converterxml.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class ClasseNacional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "especificacao")
	private String especificacao;
	
	@OneToMany(mappedBy = "classeNacional")
	private List<SubClasseNacional> subClasseNacional;
	
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

	public List<SubClasseNacional> getSubClasseNacional() {
		return subClasseNacional;
	}

	public void setSubClasseNacional(List<SubClasseNacional> subClasseNacional) {
		this.subClasseNacional = subClasseNacional;
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
		ClasseNacional other = (ClasseNacional) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
