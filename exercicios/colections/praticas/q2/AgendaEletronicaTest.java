package br.unifacisa.si.pp.exercicios.colections.praticas.q2;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaEletronicaTest {

	AgendaEletronica agenda;

	@BeforeEach
	void setUp() throws Exception {
		agenda = new AgendaEletronica();

	}

	@Test
	void addContatoTest() throws Exception {

		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "ted@ted.com", 83998016);

		Assert.assertEquals(agenda.tamanho(), 2);

	}

	@Test
	void addContatoExistenteTest() {

		agenda.addContato("Ted", "ted@ted.com", 99999999);
		agenda.addContato("Ted", "ted@ted.com", 99999999);
		
		//A TreeSet não adiciona itens iguais
		Assert.assertEquals(agenda.tamanho(), 1);
	}

	@Test
	void removerContatoTest() throws Exception {

		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "ted@ted.com", 83998016);

		Assert.assertTrue(agenda.removerContato("Ted", "ted@ted.com", 839898313));
	}

	@Test
	void removerContatoPorIdTest() throws Exception {

		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "eric@ted.com", 83998016);
		agenda.addContato("Tedonildo", "tedonildo@ted.com", 546521);
		agenda.addContato("Tedson", "tedson@ted.com", 878487);

		agenda.removerContato("Ted");
		System.out.println(agenda.getContatos());

		Assert.assertEquals(agenda.tamanho(), 1);
	}

	@Test
	void listarContatosTest() throws Exception {

		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "eric@ted.com", 83998016);
		agenda.addContato("Tedonildo", "tedonildo@ted.com", 546521);
		agenda.addContato("Tedson", "tedson@ted.com", 878487);

		agenda.listarContatos("Ted");
		System.out.println(agenda.listarContatos("Ted"));

		Assert.assertEquals(agenda.listarContatos("Ted").size(), 3);
	}

}
