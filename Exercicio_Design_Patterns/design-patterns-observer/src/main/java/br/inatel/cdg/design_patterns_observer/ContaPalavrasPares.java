package br.inatel.cdg.design_patterns_observer;

public class ContaPalavrasPares implements ObservadorPalavra {

	private int numPalavras;
	
	@Override
	public void atualiza(String palavra) {
		if((palavra.length())%2 == 0)
			numPalavras++;
			
	}

	@Override
	public int getNumPalavras() {
		return numPalavras;
	}

}
