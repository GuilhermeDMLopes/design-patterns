package br.inatel.cdg.teste.ordenacao;

import static org.junit.Assert.assertTrue;

import br.inatel.cdg.ordenacao.BubbleSort;
import br.inatel.cdg.ordenacao.InsertionSort;
import br.inatel.cdg.ordenacao.SelectionSort;
import org.junit.Test;

import br.inatel.cdg.ordenacao.Ordenacao;
import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaBubbleSort;
import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaSelectionSort;
import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaInsertionSort;

public class TestOrdenacao {
	
	Ordenacao ordenacao;
	
	@Test
	public void testeBubbleSort() {
		ordenacao = new BubbleSort();
		assertTrue(ordenacao.getOrdenacao() instanceof RealizaBubbleSort);
	}
	
	@Test
	public void testeInsertionSort() {
		ordenacao = new InsertionSort();
		assertTrue(ordenacao.getOrdenacao() instanceof RealizaInsertionSort);
	}
	
	@Test
	public void testeSelectionSort() {
		ordenacao = new SelectionSort();
		assertTrue(ordenacao.getOrdenacao() instanceof RealizaSelectionSort);
		ordenacao.setOrdenacao(new RealizaInsertionSort());
		assertTrue(ordenacao.getOrdenacao() instanceof RealizaInsertionSort);
	}
	
	
	
}
