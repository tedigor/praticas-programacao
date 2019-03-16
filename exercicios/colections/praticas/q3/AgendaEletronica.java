package br.unifacisa.si.pp.exercicios.colections.praticas.q3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;




public class AgendaEletronica {
	
	Map<String, Contato> contatos;

	
	public AgendaEletronica() {
	
		contatos = new HashMap<>();
	}
	
	public void addContato(String key, String email, long numero) {
		
		Contato c = new Contato(email, numero);
		
		contatos.put(key, c);
	
	}
	
	public boolean removerContato(String key, String email, long numero) {
		
		Contato c = new Contato(email, numero);
		
		return contatos.remove(key, c);
	}
	
	public void removerContato(String id) {
		
		this.contatos.keySet().removeIf(key -> key.toLowerCase().contains(id.toLowerCase()));		
	}
	
		
	@Override
	public String toString() {
		
		String print = "";
		
		for (String key : contatos.keySet()) {
            
            Contato value = contatos.get(key);
            print += key + value;
     }
		
		
		return print;
	}

	public int tamanho() {
		return this.contatos.size();
	}

	public Map<String, Contato> getContatos() {
		return contatos;
	}
	
}
