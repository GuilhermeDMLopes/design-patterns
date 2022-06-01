package br.inatel.cdg.design_patterns_observer;

public class ContaTodasAsPalavrasObservador implements ObservadorPalavra {

	private int numPalavras;
	
	@Override
	public void atualiza(String palavra) {
		numPalavras++;
	}

	@Override
	public int getNumPalavras() {
		return numPalavras;
	}
	
}