package com.example.converterxml.model;

import java.util.Date;
import javax.persistence.*;

@Entity
public class DadosDeMadri {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numeroInscricaoInternacional")
	private String numeroInscricaoInternacional; 
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dataRecebimentoInpi")
	private Date dataRecebimentoInpi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroInscricaoInternacional() {
		return numeroInscricaoInternacional;
	}

	public void setNumeroInscricaoInternacional(String numeroInscricaoInternacional) {
		this.numeroInscricaoInternacional = numeroInscricaoInternacional;
	}

	public Date getDataRecebimentoInpi() {
		return dataRecebimentoInpi;
	}

	public void setDataRecebimentoInpi(Date dataRecebimentoInpi) {
		this.dataRecebimentoInpi = dataRecebimentoInpi;
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
		DadosDeMadri other = (DadosDeMadri) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
