package br.unifacisa.si.pp.exercicios.q3;

import java.util.ArrayList;

public class Poligono {

	private ArrayList<Ponto> pontos;

	/**
	 * @param numeroLados
	 */
	public Poligono() {

		this.pontos = new ArrayList<Ponto>();

	}

	public void addPonto(int x, int y) throws Exception {
		Ponto ponto = new Ponto(x, y);

		if (!pontos.contains(ponto)) {
			this.pontos.add(ponto);
		} else {
			throw new Exception("O Ponto " + ponto + " já foi adicionado");
		}
	}

	public void removePonto(int x, int y) throws Exception {
		Ponto ponto = new Ponto(x, y);

		if (pontos.contains(ponto)) {
			this.pontos.remove(ponto);
		} else {
			throw new Exception("O ponto " + ponto + " não existe");
		}

	}

	public ArrayList<Ponto> getPontos() {
		return pontos;
	}

	public double areaPoligono() {
		double somaLados = 0;

		for (int i = 0; i < this.pontos.size(); i++) {

			if (i == pontos.size() - 1) {
				somaLados += (this.pontos.get(i).getX() * this.pontos.get(0).getY()
						- this.pontos.get(0).getX() * this.pontos.get(i).getY());
			}else {
				somaLados += (this.pontos.get(i).getX() * this.pontos.get(i + 1).getY()
						- this.pontos.get(i + 1).getX() * this.pontos.get(i).getY());				
			}
		}

		return somaLados / 2;
	}

	
	@Override
	public String toString() {
		return this.pontos.toString();
	}

}
