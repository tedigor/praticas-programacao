package br.unifacisa.si.pp.exercicios.q5;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FormasGeometricaTest {

	private ArrayList<Object> vetor;

	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		
		this.vetor = new ArrayList<>();
		
		vetor.add(new Retangulo(6, 3));
		vetor.add(new Retangulo(8, 4));
		vetor.add(new Quadrado(4));
		vetor.add(new Quadrado(8));
		vetor.add(new Circulo(4));
		vetor.add(new Circulo(8));
	}

	@Test
	public void ImprimeDados() {

		String forma = "";

		for (int i = 0; i < vetor.size(); i++) {

			if (vetor.get(i) instanceof Retangulo) {
				Retangulo r = (Retangulo) vetor.get(i);

				forma += "Base = " + r.getBase() + " Altura = " + r.getAltura() + "\n";
			}

			if (vetor.get(i) instanceof Quadrado) {
				Quadrado q = (Quadrado) vetor.get(i);

				forma += "Lado = " + q.getLado() + "\n";
			}

			if (vetor.get(i) instanceof Circulo) {
				Circulo c = (Circulo) vetor.get(i);

				forma += "Raio = " + c.getRaio() + "\n";
			}

		}

		System.out.println(forma);
	}
	
	@Test
	public void ImprimePerimetro() {

		String perimetro = "";

		for (int i = 0; i < vetor.size(); i++) {

			if (vetor.get(i) instanceof Retangulo) {
				Retangulo r = (Retangulo) vetor.get(i);

				perimetro += "Perimetro do Retangulo = " + r.perimetro() + "\n";
			}

			if (vetor.get(i) instanceof Quadrado) {
				Quadrado q = (Quadrado) vetor.get(i);

				perimetro += "Perimetro do Quadrado = " + q.perimetro() + "\n";
			}

			if (vetor.get(i) instanceof Circulo) {
				Circulo c = (Circulo) vetor.get(i);

				perimetro += "Perimetro do Circulo = " + c.perimetro() + "\n";
			}

		}

		System.out.println(perimetro);
	}
	
	@Test
	public void ImprimeArea() {

		String area = "";

		for (int i = 0; i < vetor.size(); i++) {

			if (vetor.get(i) instanceof Retangulo) {
				Retangulo r = (Retangulo) vetor.get(i);

				area += "Área do Retangulo = " + r.area() + "\n";
			}

			if (vetor.get(i) instanceof Quadrado) {
				Quadrado q = (Quadrado) vetor.get(i);

				area += "Área do Quadrado = " + q.area() + "\n";
			}

			if (vetor.get(i) instanceof Circulo) {
				Circulo c = (Circulo) vetor.get(i);

				area += "Área do Circulo = " + c.area() + "\n";
			}

		}

		System.out.println(area);
	}

}
