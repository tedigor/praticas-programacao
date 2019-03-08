package br.unifacisa.si.pp.exercicios.q5;

public class Quadrado implements FormasGeometrica {
	
	
	private double lado;
	
	/**
	 * @param lado
	 */
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	

	public double getLado() {
		return lado;
	}


	@Override
	public double perimetro() {
		
		return 4*lado;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}

}
