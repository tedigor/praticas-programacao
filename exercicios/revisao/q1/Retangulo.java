package br.unifacisa.si.pp.exercicios.q1;

public class Retangulo {
	
	private double largura, altura;

	/**
	 * @param largura
	 * @param altura
	 */
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	/**
	 * 
	 */
	public Retangulo() {
		largura = 0;
		altura = 0;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPerimetro() {
		
		return 2*altura + 2*largura; 
	}
	
	public double getArea() {
		return altura*largura;
	}
	
	@Override
	public String toString() {
		return "Largura: " + largura + "Altura: " + altura; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if(obj instanceof Retangulo) {
			Retangulo r = (Retangulo) obj;
			
			if(this.altura == r.getAltura() && this.largura == r.getLargura()) {
				return true;
			}
			
			return false;
		}
		
		return false;
	}
	
}
