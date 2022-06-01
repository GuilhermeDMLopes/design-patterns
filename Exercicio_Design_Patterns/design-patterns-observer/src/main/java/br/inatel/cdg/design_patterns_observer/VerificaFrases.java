package br.inatel.cdg.design_patterns_observer;

import java.util.ArrayList;
import java.util.List;

public class VerificaFrases {

	private List<ObservadorPalavra> observadores;
	
	public VerificaFrases() {
		observadores = new ArrayList<ObservadorPalavra>();
	}
	
	public void processarFrase(String frase) {
		
		String[] palavras = frase.split(" ");
		for (String palavra : palavras) {
			for (ObservadorPalavra observador : observadores) {
				observador.atualiza(palavra);
			}
		}
	
	}

	public void registraObservador(ObservadorPalavra obs) {
		observadores.add(obs);
	}

	public void removeObservador(ObservadorPalavra obs) {
		observadores.remove(obs);
		
	}

	public List<ObservadorPalavra> getObservadores() {
		return observadores;
	}
	
}