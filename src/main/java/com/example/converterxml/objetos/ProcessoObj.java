package com.example.converterxml.objetos;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "processo")
public class ProcessoObj {

	private String numero;

	private String apostila;

	private DadosDeMadriObj dadosDeMadri;

	private String procurador;

	private MarcaObj marca;

	private ClasseNacionalObj classeNacional;
	
	private List<SobrestadorObj> sobrestadores;

	private List<DespachoObj> despachos;

	private List<TitularObj> titulares;

	private List<ClasseViennaObj> classesVienna;

	private List<ClasseNiceObj> listaClasseNice;

	private List<PrioridadeObj> prioridadeUnionista;

	@XmlElementWrapper(name = "despachos")
	@XmlElement(name = "despacho")
	public List<DespachoObj> getDespachos() {
		return despachos;
	}

	@XmlAttribute(name = "numero")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDespachos(List<DespachoObj> despachos) {
		this.despachos = despachos;
	}

	@XmlElementWrapper(name = "titulares")
	@XmlElement(name = "titular")
	public List<TitularObj> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<TitularObj> titulares) {
		this.titulares = titulares;
	}

	@XmlElement(name = "procurador")
	public String getProcurador() {
		return procurador;
	}

	public void setProcurador(String procurador) {
		this.procurador = procurador;
	}

	@XmlElementWrapper(name = "sobrestadores")
	@XmlElement(name = "sobrestador")
	public List<SobrestadorObj> getSobrestadores() {
		return sobrestadores;
	}

	public void setSobrestadores(List<SobrestadorObj> sobrestadores) {
		this.sobrestadores = sobrestadores;
	}

	@XmlElement(name = "marca")
	public MarcaObj getMarca() {
		return marca;
	}

	public void setMarca(MarcaObj marca) {
		this.marca = marca;
	}

	@XmlElement(name = "classe-nacional")
	public ClasseNacionalObj getClasseNacional() {
		return classeNacional;
	}

	public void setClasseNacional(ClasseNacionalObj classeNacional) {
		this.classeNacional = classeNacional;
	}

	@XmlElementWrapper(name = "classes-vienna")
	@XmlElement(name = "classe-vienna")
	public List<ClasseViennaObj> getClassesVienna() {
		return classesVienna;
	}

	public void setClassesVienna(List<ClasseViennaObj> classesVienna) {
		this.classesVienna = classesVienna;
	}

	@XmlElementWrapper(name = "lista-classe-nice")
	@XmlElement(name = "classe-nice")
	public List<ClasseNiceObj> getListaClasseNice() {
		return listaClasseNice;
	}

	public void setListaClasseNice(List<ClasseNiceObj> listaClasseNice) {
		this.listaClasseNice = listaClasseNice;
	}

	@XmlElementWrapper(name = "prioridade-unionista")
	@XmlElement(name = "prioridade")
	public List<PrioridadeObj> getPrioridadeUnionista() {
		return prioridadeUnionista;
	}

	public void setPrioridadeUnionista(List<PrioridadeObj> prioridadeUnionista) {
		this.prioridadeUnionista = prioridadeUnionista;
	}

	@XmlElement(name = "dados-de-madri")
	public DadosDeMadriObj getDadosDeMadri() {
		return dadosDeMadri;
	}

	public void setDadosDeMadri(DadosDeMadriObj dadosDeMadri) {
		this.dadosDeMadri = dadosDeMadri;
	}

	@XmlElement(name = "apostila")
	public String getApostila() {
		return apostila;
	}

	public void setApostila(String apostila) {
		this.apostila = apostila;
	}
}
