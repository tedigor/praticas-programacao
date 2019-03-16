package br.unifacisa.si.pp.exercicios.colections.praticas.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaEletronica {

	private List<Contato> contatos;

	/**
	 * @param contatos
	 */
	public AgendaEletronica() {
		this.contatos = new ArrayList<>();
	}

	public void addContato(String nome, String email, int numero) throws Exception {

		Contato c = new Contato(nome, email, numero);

		if (contatos.contains(c)) {
			throw new Exception("O contato já está na agenda!");
		}

		contatos.add(c);
	}

	public List<Contato> getContatos() {
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

	public List<Contato> listarContatos(String id) {

		List<Contato> lista = new ArrayList<>();

		contatos.forEach(contato -> {
			if (contato.getNome().contains(id)) {
				lista.add(contato);
			}
		});

		return lista;

	}

}
