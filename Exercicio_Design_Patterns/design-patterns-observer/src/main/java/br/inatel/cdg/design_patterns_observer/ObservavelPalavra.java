package br.inatel.cdg.design_patterns_observer;


public interface ObservavelPalavra {

	public void registraObservador(ObservadorPalavra obs);
	public void removeObservador(ObservadorPalavra obs);
	public void notificaObservadores();
	
}
