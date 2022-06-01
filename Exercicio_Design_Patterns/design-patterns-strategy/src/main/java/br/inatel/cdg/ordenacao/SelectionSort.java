package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaSelectionSort;

public class SelectionSort extends Ordenacao {

	public SelectionSort() {
		ordena = new RealizaSelectionSort();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Tipo de ordenação Selection Sort!");
	}

}