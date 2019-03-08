package br.unifacisa.si.pp.exercicios.q3;

public class Ponto {
	
	private int x;
	private int y;
	
		
	/**
	 * @param x
	 * @param y
	 */
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if(obj instanceof Ponto) {
			Ponto p = (Ponto) obj;
			
			if (this.x == p.getX() && this.y == p.getY()) {
				return true;
			}
			
			return false;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "x= " + this.x + " y= " + this.y;
	}
	
}
