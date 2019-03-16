package br.unifacisa.si.pp.exercicios.colections.praticas.q3;


public class Contato {
	
	private String email;
	private long numero;
	/**
	 * @param email
	 * @param numero
	 */
	public Contato(String email, long numero) {
		this.email = email;
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}

		if (obj instanceof Contato) {
			Contato c = (Contato) obj;

			if (c.getEmail().equals(email) && c.getNumero() == numero) {
				return true;
			}

			return false;
		}

		return false;
	}
	
	@Override
	public String toString() {
		return "{Email:" + email + ", " + "Numero:" + numero + "}";
	}
	
}
