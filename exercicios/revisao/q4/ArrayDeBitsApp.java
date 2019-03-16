package br.unifacisa.si.pp.exercicios.q4;

public class ArrayDeBitsApp {

	public static void main(String[] args) {
		ArrayDeBits bits = new ArrayDeBits(2);
		ArrayDeBits bits2 = new ArrayDeBits(3);
		bits.setBits(true, 0);
		bits.setBits(true, 1);

		bits2.setBits(true, 0);
		bits2.setBits(false, 1);
		bits2.setBits(false, 2);

		bits.and(bits2);

		System.out.println(bits);
	}
}
