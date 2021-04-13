package com.example.converterxml.metodos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.converterxml.model.*;
import com.example.converterxml.objetos.*;
import com.example.converterxml.repositorios.CedenteRepositorio;
import com.example.converterxml.repositorios.CessionarioRepositorio;
import com.example.converterxml.repositorios.ClasseNacionalRepositorio;
import com.example.converterxml.repositorios.ClasseNiceRepositorio;
import com.example.converterxml.repositorios.ClasseViennaRepositorio;
import com.example.converterxml.repositorios.DadosDeMadriRepositorio;
import com.example.converterxml.repositorios.DespachoRepositorio;
import com.example.converterxml.repositorios.MarcaRepositorio;
import com.example.converterxml.repositorios.PrioridadeRepositorio;
import com.example.converterxml.repositorios.ProcessoRepositorio;
import com.example.converterxml.repositorios.ProtocoloRepositorio;
import com.example.converterxml.repositorios.RequerenteRepositorio;
import com.example.converterxml.repositorios.RevistaRepositorio;
import com.example.converterxml.repositorios.SobrestadorRepositorio;
import com.example.converterxml.repositorios.SubClasseNacionalRepositorio;
import com.example.converterxml.repositorios.TitularRepositorio;

@Service
public class SalvaDados {
	
	@Autowired
	private RevistaRepositorio revistaRepositorio;
	
	@Autowired
	private DadosDeMadriRepositorio dadosDeMadriRepositorio;
	
	@Autowired
	private MarcaRepositorio marcaRepositorio;
	
	@Autowired
	private ClasseNacionalRepositorio classeNacionalRepositorio;
	
	@Autowired
	private SubClasseNacionalRepositorio subClasseNacionalRepositorio;
	
	@Autowired
	private ProcessoRepositorio processoRepositorio;
	
	@Autowired
	private SobrestadorRepositorio sobrestadorRepositorio;
	
	@Autowired
	private ProtocoloRepositorio protocoloRepositorio;
	
	@Autowired
	private RequerenteRepositorio requerenteRepositorio;
	
	@Autowired
	private CedenteRepositorio cedenteRepositorio;
	
	@Autowired
	private CessionarioRepositorio cessionarioRepositorio;
	
	@Autowired
	private TitularRepositorio titularRepositorio;
	
	@Autowired
	private DespachoRepositorio despachoRepositorio;
	
	@Autowired
	private ClasseViennaRepositorio classeViennaRepositorio;
	
	@Autowired
	private ClasseNiceRepositorio classeNiceRepositorio;
	
	@Autowired
	private PrioridadeRepositorio prioridadeRepositorio;
	
	public void salvar(RevistaObj revistaObj) {		
		Revista revista = new Revista();
		
		if(revistaObj != null) {
			revista.setNumero(revistaObj.getNumero());		
			revista.setData(revistaObj.getData());
		}
		if(revistaObj.getProcesso() != null) {
			revistaRepositorio.save(revista);
			
			for(ProcessoObj processoObj: revistaObj.getProcesso()) {
				Processo processo= new Processo();
				processo.setNumero(processoObj.getNumero());
				processo.setApostila(processoObj.getApostila());
				processo.setProcurador(processoObj.getProcurador());
		
				//adicionar dados de madri
				DadosDeMadriObj dadosDeMadriObj = processoObj.getDadosDeMadri();
				DadosDeMadri dadosDeMadri = new DadosDeMadri();
				dadosDeMadri.setDataRecebimentoInpi(dadosDeMadriObj.getDataRecebimentoInpi());
				dadosDeMadri.setNumeroInscricaoInternacional(dadosDeMadriObj.getNumeroInscricaoInternacional());
				processo.setDadosDeMadri(dadosDeMadri);
				dadosDeMadriRepositorio.save(dadosDeMadri);
				
				//adicionar Marca
				MarcaObj marcaObj = processoObj.getMarca();
				Marca marca = new Marca();
				marca.setApresentacao(marcaObj.getApresentacao());
				marca.setNatureza(marcaObj.getNatureza());
				marca.setNome(marcaObj.getNome());
				processo.setMarca(marca);
				marcaRepositorio.save(marca);
				
				//adicionar classeNacional
				ClasseNacionalObj classeNacionalObj = processoObj.getClasseNacional();
				ClasseNacional classeNacional = new ClasseNacional();
				classeNacional.setCodigo(classeNacionalObj.getCodigo());
				classeNacional.setEspecificacao(classeNacionalObj.getEspecificacao());
				processo.setClasseNacional(classeNacional);
				classeNacionalRepositorio.save(classeNacional);
				
					// adicionar subClasseNacional
				if (classeNacionalObj.getSubClassesNacional() != null) {
					for(SubClasseNacionalObj subClasseNacionalObj: classeNacionalObj.getSubClassesNacional()) {
						SubClasseNacional subClasseNacional = new SubClasseNacional(); 
						subClasseNacional.setCodigo(subClasseNacionalObj.getCodigo());
						subClasseNacional.setClasseNacional(classeNacional);
						subClasseNacionalRepositorio.save(subClasseNacional);
					}
				}
				processo.setRevista(revista);
				processoRepositorio.save(processo);
				
				if(processoObj.getSobrestadores() != null){
					for (SobrestadorObj sobrestadorObj : processoObj.getSobrestadores()) {
						Sobrestador sobrestador = new Sobrestador();
						sobrestador.setProcesso_sobrestador(sobrestadorObj.getProcesso());
						sobrestador.setMarca(sobrestadorObj.getMarca());
						sobrestador.setProcesso(processo);
						sobrestadorRepositorio.save(sobrestador);
					}
				}
				if(processoObj.getDespachos() != null) {
					for(DespachoObj despachoObj: processoObj.getDespachos()) {
						Despacho despacho = new Despacho();
						despacho.setCodigo(despachoObj.getCodigo());
						despacho.setNome(despachoObj.getNome());
						despacho.setTextoComplementar(despachoObj.getTextoComplementar());
						despacho.setTextoSobrestamento(despachoObj.getTextoSobrestamento());
						despacho.setProcesso(processo);
						
						
						//adicionar protocolo
						ProtocoloObj protocoloObj = despachoObj.getProtocolo();
						Protocolo protocolo = new Protocolo();
						protocolo.setNumero(protocoloObj.getNumero());
						protocolo.setData(protocoloObj.getData());
						protocolo.setCodigoServico(protocoloObj.getCodigoServico());
						protocolo.setProcurador(protocoloObj.getProcurador());
						despacho.setProtocolo(protocolo);
					
							// adicionar Requerente
							RequerenteObj requerenteObj = protocoloObj.getRequerente();
							Requerente requerente = new Requerente();
							requerente.setNomeRazaoSocial(requerenteObj.getNomeRazaoSocial());
							requerente.setPais(requerenteObj.getPais());
							requerente.setUf(requerenteObj.getUf());
							protocolo.setRequerente(requerente);
							requerenteRepositorio.save(requerente);
							
							protocoloRepositorio.save(protocolo);
							
							despachoRepositorio.save(despacho);
							
							// adiciona Cedente
							if(protocoloObj.getCedente() != null) {
								for(CedenteObj cedenteObj: protocoloObj.getCedente()) {
									Cedente cedente = new Cedente();
									cedente.setNomeRazaoSocial(cedenteObj.getNomeRazaoSocial());
									cedente.setPais(cedenteObj.getPais());
									cedente.setProtocolo(protocolo);
									cedenteRepositorio.save(cedente);
								}
							}
							
							
							
							// adiciona Cessionario
							if(protocoloObj.getCessionario() != null) {
								for(CessionarioObj cessionarioObj: protocoloObj.getCessionario()) {
									Cessionario cessionario = new Cessionario();
									cessionario.setNomeRazaoSocial(cessionarioObj.getNomeRazaoSocial());
									cessionario.setProtocolo(protocolo);
									cessionarioRepositorio.save(cessionario);
								}
							}	
					}
				}
				if(processoObj.getTitulares() != null) {
					for(TitularObj titularObj: processoObj.getTitulares()) {
						Titular titular = new Titular();
						titular.setNomeRazaoSocial(titularObj.getNomeRazaoSocial());
						titular.setPais(titularObj.getPais());
						titular.setUf(titularObj.getUf());
						titular.setProcesso(processo);
						titularRepositorio.save(titular);
					}
				}
				if(processoObj.getClassesVienna() != null) {
					for(ClasseViennaObj classeViennaObj: processoObj.getClassesVienna()) {
						ClasseVienna classeVienna = new ClasseVienna();
						classeVienna.setCodigo(classeViennaObj.getCodigo());
						classeVienna.setEdicao(classeViennaObj.getEdicao());
						classeVienna.setProcesso(processo);
						classeViennaRepositorio.save(classeVienna);
					}
				}
				if(processoObj.getListaClasseNice() != null) {
					for(ClasseNiceObj classeNiceObj: processoObj.getListaClasseNice()) {
						ClasseNice classeNice = new ClasseNice();
						classeNice.setCodigo(classeNiceObj.getCodigo());
						classeNice.setEspecificacao(classeNiceObj.getEspecificacao());
						classeNice.setTraducaoEspecificacao(classeNiceObj.getTraducaoEspecificacao());
						classeNice.setStatus(classeNiceObj.getStatus());
						classeNice.setProcesso(processo);
						classeNiceRepositorio.save(classeNice);
					}
				}
				if(processoObj.getPrioridadeUnionista() != null) {
					for(PrioridadeObj prioridadeObj: processoObj.getPrioridadeUnionista()) {
						Prioridade prioridade = new Prioridade();
						prioridade.setData(prioridadeObj.getData());
						prioridade.setNumero(prioridadeObj.getNumero());
						prioridade.setPais(prioridadeObj.getPais());
						prioridade.setProcesso(processo);
						prioridadeRepositorio.save(prioridade);
					}
				}
			}
			
		}
	}	
}
