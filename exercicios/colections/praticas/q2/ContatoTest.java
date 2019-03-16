package br.unifacisa.si.pp.exercicios.colections.praticas.q2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ContatoTest {

	@Test
	void compareToTest() {
	
		Contato contato1 = new Contato("Ted","ted@ted.com", 99999999);
		Contato contato2 = new Contato("Ted","ted@ted.com", 99999999);
		
		Assert.assertEquals(contato1.compareTo(contato2), 1);
	}

}
