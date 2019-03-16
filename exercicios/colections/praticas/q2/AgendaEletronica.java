package br.unifacisa.si.pp.exercicios.colections.praticas.q2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class AgendaEletronica {

	Set<Contato> contatos;

	public AgendaEletronica() {
		contatos = new TreeSet<>();
	}
	
	public void addContato(String nome, String email, int numero) {
		
		Contato c = new Contato(nome, email, numero);
		
		contatos.add(c);
		
	}

	public Set<Contato> getContatos() {
		return contatos;
	}

	public int tamanho() {
		return contatos.size();
	}

	public void removerContato(String id) {

		Iterator<Contato> i = contatos.iterator();
		while (i.hasNext()) {
			Contato c = i.next();
			if (c.getNome().contains(id)) {
				i.remove();
			}
		}

	}

	public boolean removerContato(String nome, String email, int numero) {
		
		Contato c = new Contato(nome, email, numero);
		
		if (contatos.contains(c)) {
			contatos.remove(c);
			return true;
		}

		return false;
	}

	public Set<Contato> listarContatos(String id) {

		Set<Contato> lista = new TreeSet<>();

		contatos.forEach(contato -> {
			if (contato.getNome().contains(id)) {
				lista.add(contato);
			}
		});

		return lista;

	}
}
