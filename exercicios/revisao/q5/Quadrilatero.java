package br.unifacisa.si.pp.exercicios.q5;

public abstract class Quadrilatero implements FormasGeometrica{
	
	private double ladoA, ladoB, ladoC, ladoD;

	/**
	 * @param ladoA
	 * @param ladoB
	 * @param ladoC
	 * @param ladoD
	 */
	public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
	}
	
	@Override
	public double perimetro() {
		
		return ladoA + ladoB + ladoC + ladoD;
	}
}
