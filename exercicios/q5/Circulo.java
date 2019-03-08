package br.unifacisa.si.pp.exercicios.q5;

public class Circulo implements FormasGeometrica {

	private static final double PI = 3.14;
	private double raio;
	
	/**
	 * @param raio
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	

	public double getRaio() {
		return raio;
	}


	@Override
	public double perimetro() {
		return 2 * PI * raio;
	}

	@Override
	public double area() {
		return PI * Math.pow(raio, 2);
	}

}
