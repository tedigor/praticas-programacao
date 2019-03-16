package br.unifacisa.si.pp.exercicios.q4;

public class ArrayDeBits {

	private boolean[] bits;

	public ArrayDeBits(int t) {
		this.bits = new boolean[t];
	}

	public boolean getBit(int pos) {

		return this.bits[pos];
	}

	public boolean[] getBits() {

		return this.bits;
	}

	public void setBits(boolean bit, int pos) {
		this.bits[pos] = bit;
	}

	public void and(ArrayDeBits bits2) {
		int tam = this.bits.length < bits2.getBits().length ? this.bits.length : bits2.getBits().length;

		for (int i = 0; i < tam; i++) {
			bits[i] = bits[i] && bits2.getBits()[i];
		}
	}

	public String toString() {

		String array = "";

		for (int i = 0; i < bits.length; i++) {
			if (i == 0) {
				array += "[" + bits[i] + ", ";
			} else {
				if (i == bits.length - 1) {
					array += bits[i] + "]";
				} else {
					array += bits[i] + ", ";
				}
			}
		}
		return array;
	}
}
