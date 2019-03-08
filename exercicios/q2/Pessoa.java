package br.unifacisa.si.pp.exercicios.q2;

public class Pessoa {
	
	private String nome, sexo;
	private int idade;
	private double altura, peso;
	/**
	 * @param nome
	 * @param sexo
	 * @param idade
	 * @param altura
	 * @param peso
	 */
	public Pessoa(String nome, String sexo, int idade, double altura, double peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getImc() {
		
		return peso / Math.pow(altura, 2);
	}
	
	public String toString() {
		
		double imc = getImc();
		String descricao = "";
		
		if(imc <= 18.5) {
			descricao = "abaixo do peso normal";
		}
		else if(imc > 18.5 && imc <= 25) {
			descricao = "peso normal";
		}
		else if(imc > 25 && imc <= 30) {
			descricao = "acima do peso normal";
		}
		else if(imc > 30) {
			descricao = "obesidade";
		}
		
		return "Nome: " + nome + "\n" + "IMC= " + String.format("%.2f", imc) + ": " + descricao;
	}
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Ted", "M", 28, 1.63, 79);
		
		System.out.println(pessoa);
	}
}
