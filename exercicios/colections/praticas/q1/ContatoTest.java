package br.unifacisa.si.pp.exercicios.colections.praticas.q1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ContatoTest {
		
	@Test
	void testEqual() {
	
		Contato contato1 = new Contato("Ted","ted@ted.com", 8989898);
		Contato contato2 = new Contato("Ted","ted@ted.com", 8989898);
		
		Assert.assertTrue(contato1.equals(contato2));
	}

}
