package br.unifacisa.si.pp.exercicios.colections.praticas.q3;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaEletronicaTest {
	
	AgendaEletronica agenda;
	
	@BeforeEach
	void setUp() throws Exception {
		agenda = new AgendaEletronica();
	
	}

	@Test
	void addTest() {
	
		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "eric@ted.com", 83998016);
		agenda.addContato("Tedonildo", "tedonildo@ted.com", 546521);
		agenda.addContato("Tedson", "tedson@ted.com", 878487);
		
		
		Assert.assertEquals(agenda.tamanho(), 4);
		
	}
	
	
	@Test
	void removePorStringTest() {
	
		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "eric@ted.com", 83998016);
		agenda.addContato("Tedonildo", "tedonildo@ted.com", 546521);
		agenda.addContato("Tedson", "tedson@ted.com", 878487);
		
		agenda.removerContato("Ted");
		
		Assert.assertEquals(agenda.tamanho(), 1);
		Assert.assertTrue(agenda.getContatos().containsKey("Eric"));
		
		
	}
	
	@Test
	void removePorContatoTest() {
	
		agenda.addContato("Ted", "ted@ted.com", 839898313);
		agenda.addContato("Eric", "eric@ted.com", 83998016);
		agenda.addContato("Tedonildo", "tedonildo@ted.com", 546521);
		agenda.addContato("Tedson", "tedson@ted.com", 878487);
		
		agenda.removerContato("Ted", "ted@ted.com", 839898313);
		
		Assert.assertFalse(agenda.getContatos().containsKey("Ted"));
		
	}

}
