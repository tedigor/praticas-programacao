package br.unifacisa.si.pp.exercicios.colections.praticas.q1;

public class Contato {

	private String nome, email;
	private int numero;

	/**
	 * @param nome
	 * @param email
	 * @param numero
	 */
	public Contato(String nome, String email, int numero) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (obj instanceof Contato) {
			Contato c = (Contato) obj;

			if (c.getNome().equals(nome) && c.getEmail().equals(email) && c.getNumero() == numero) {
				return true;
			}

			return false;
		}

		return false;
	}
	
	
	@Override
	public String toString() {
		return "{Nome:" + nome + ", " + "Email:" + email + ", " + "Numero:" + numero + "}";
	}
}
