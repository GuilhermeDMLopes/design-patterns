package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaBubbleSort;
import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaSelectionSort;

public class BubbleSort extends Ordenacao {

	public BubbleSort() {
		ordena = new RealizaBubbleSort();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Tipo de ordenação Bubble Sort!");
	}

}