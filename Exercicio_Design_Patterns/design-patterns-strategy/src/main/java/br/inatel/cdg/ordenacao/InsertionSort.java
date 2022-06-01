package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.comportamento.ordena.impl.RealizaInsertionSort;

public class InsertionSort extends Ordenacao {

	public InsertionSort() {
		ordena = new RealizaInsertionSort();
	}
	
	@Override
	public void mostrar() {
		System.out.println("Tipo de ordenação Insertion Sort!!");
	}

}
