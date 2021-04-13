package com.example.converterxml.metodos;

import java.util.List;

public class RemoveDadosEquivalentes {
	
	public static List<String> removeDadosEquivalentes(List<String> lista) {
   	 for (int i = 0; i < lista.size(); i++) {
				for (int j = 0; j < lista.size(); j++) {
					
					if(i != j) {
						if(lista.get(j).equals(lista.get(i))) {
							lista.remove(j);
							j = j-1;
						}
					}				
				}
			}
   	 return lista;
    }
}
