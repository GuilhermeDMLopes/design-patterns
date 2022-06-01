package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.comportamento.Ordena;

public abstract class Ordenacao {
	
	//Composicao com instancia de Ordenação
	protected Ordena ordena;
	public abstract void mostrar();
	
	//Comportamento delegado
	public void executarOrdenacao() {
		ordena.ordena();
	}
	
	//Getter e Setter
	public void setOrdenacao(Ordena ordena) {
		this.ordena = ordena;
	}
	
	public Ordena getOrdenacao() {
		return ordena;
	}
}