package com.example.converterxml.metodos;

import java.util.ArrayList;
import java.util.List;

public class ComparaListas {
	  public static List<String> comparaListas(List<String> lista, List<String> listaNova) {
	    	 List<String> listaItems = new ArrayList<>();
	    
	    	 for (int i = 0; i < listaNova.size(); i++) {
				
	    		 if(!lista.contains(listaNova.get(i))) {
	    			listaItems.add(listaNova.get(i));
	    		 }
			}
	    	 return listaItems;
	    }
}
