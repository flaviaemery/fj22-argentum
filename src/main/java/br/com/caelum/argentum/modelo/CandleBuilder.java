package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public class CandleBuilder {
	
	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;
	
	public CandleBuilder comAbertura (double abertura) {
		this.abertura = abertura;
		return this;
		
	public CandleBuider comFechamento (double fechamento) {
		this.fechamento = fechamento;
		return this;
	}
	}
	
}
