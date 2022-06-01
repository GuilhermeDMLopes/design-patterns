package br.inatel.cdg.design_patterns_observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestePalavras {

	private String frase = "Testando frases com funções";
	
	@Test
	public void testTotalPalavras() {
		
		VerificaFrases processador = new VerificaFrases();
		processador.registraObservador(new ContaTodasAsPalavrasObservador());
		processador.processarFrase(frase);
		assertEquals(4, processador.getObservadores().get(0).getNumPalavras());
	
	}
	
	@Test
	public void testTodasAsFunc() {
		
		VerificaFrases processador = new VerificaFrases();
		processador.registraObservador(new ContaTodasAsPalavrasObservador());
		processador.registraObservador(new ContaPalavrasMaiuscula());
		processador.registraObservador(new ContaPalavrasPares());
		processador.processarFrase(frase);
		assertEquals(4, processador.getObservadores().get(0).getNumPalavras());
		assertEquals(1, processador.getObservadores().get(1).getNumPalavras());
		assertEquals(2, processador.getObservadores().get(2).getNumPalavras());
		
	}

}
