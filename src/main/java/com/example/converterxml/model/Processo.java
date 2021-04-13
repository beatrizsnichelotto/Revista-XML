package com.example.converterxml.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Processo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "numero")
	private String numero;

	@Column(name = "apostila")
	private String apostila;
	
	@OneToOne
	private DadosDeMadri dadosDeMadri;

	@Column(name = "procurador")
	private String procurador;

	@OneToOne
	private Marca marca;

	@OneToOne
	private ClasseNacional classeNacional;
	
	@OneToMany(mappedBy = "processo")
	private List<Sobrestador> sobrestadores;

	@OneToMany(mappedBy = "processo")
	private List<Despacho> despachos;

	@OneToMany(mappedBy = "processo")
	private List<Titular> titulares;

	@OneToMany(mappedBy = "processo")
	private List<ClasseVienna> classesVienna;

	@OneToMany(mappedBy = "processo")
	private List<ClasseNice> listaClasseNice;

	@OneToMany(mappedBy = "processo")
	private List<Prioridade> prioridadeUnionista;
	
	@ManyToOne
	private Revista revista;

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

	public String getApostila() {
		return apostila;
	}

	public void setApostila(String apostila) {
		this.apostila = apostila;
	}

	public DadosDeMadri getDadosDeMadri() {
		return dadosDeMadri;
	}

	public void setDadosDeMadri(DadosDeMadri dadosDeMadri) {
		this.dadosDeMadri = dadosDeMadri;
	}

	public String getProcurador() {
		return procurador;
	}

	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public ClasseNacional getClasseNacional() {
		return classeNacional;
	}

	public void setClasseNacional(ClasseNacional classeNacional) {
		this.classeNacional = classeNacional;
	}

	public List<Sobrestador> getSobrestadores() {
		return sobrestadores;
	}

	public void setSobrestadores(List<Sobrestador> sobrestadores) {
		this.sobrestadores = sobrestadores;
	}

	public List<Despacho> getDespachos() {
		return despachos;
	}

	public void setDespachos(List<Despacho> despachos) {
		this.despachos = despachos;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}

	public List<ClasseVienna> getClassesVienna() {
		return classesVienna;
	}

	public void setClassesVienna(List<ClasseVienna> classesVienna) {
		this.classesVienna = classesVienna;
	}

	public List<ClasseNice> getListaClasseNice() {
		return listaClasseNice;
	}

	public void setListaClasseNice(List<ClasseNice> listaClasseNice) {
		this.listaClasseNice = listaClasseNice;
	}

	public List<Prioridade> getPrioridadeUnionista() {
		return prioridadeUnionista;
	}

	public void setPrioridadeUnionista(List<Prioridade> prioridadeUnionista) {
		this.prioridadeUnionista = prioridadeUnionista;
	}

	public Revista getRevista() {
		return revista;
	}

	public void setRevista(Revista revista) {
		this.revista = revista;
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
		Processo other = (Processo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
