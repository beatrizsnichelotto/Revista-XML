package com.example.converterxml.metodos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import com.example.converterxml.objetos.RevistaObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@Service
public class XMLParaObjeto {

	@Autowired
	private SalvaDados salvaDados; 
	
	public void transformXMLToObject() {
		try {

			File file = new File("/home/operador/arquivos/RM2621.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(RevistaObj.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			RevistaObj revistaObj = (RevistaObj) jaxbUnmarshaller.unmarshal(file);

			listaTags(file);
			
			salvaDados.salvar(revistaObj);
			
		} catch (NullPointerException e) {
			EnviaMensagem.printarErro(e.toString());
		} catch (JAXBException e) {
			EnviaMensagem.printarErro(e.toString());
		} catch (Exception e) {
			EnviaMensagem.printarErro(e.toString());
		}

	}

	private void listaTags(File file) {

		try {
			List<String> listaNova = new ArrayList<String>();

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);

			NodeList nodeList = doc.getElementsByTagName("*");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element element = (Element) nodeList.item(i);
				listaNova.add(element.getNodeName());
			}

			listaNova = RemoveDadosEquivalentes.removeDadosEquivalentes(listaNova);
			List<String> lista = ListaDeTagsPadrao.listaPadrao();
			listaNova = ComparaListas.comparaListas(lista, listaNova);
			if (listaNova.size() != 0) {
				EnviaMensagem.printarErro("Campos Novos adicionados no XML :" + listaNova.toString());
			}

		} catch (Exception e) {

		}

	}

}
