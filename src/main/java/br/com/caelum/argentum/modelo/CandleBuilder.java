package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public class CandleBuilder {
	
	private Double abertura;
	private Double fechamento;
	private Double minimo;
	private Double maximo;
	private Double volume;
	private Calendar data;
	
	public CandleBuilder comAbertura (Double abertura) {
		this.abertura = abertura;
		return this;
	}
		
	public CandleBuilder comFechamento (Double fechamento) {
		this.fechamento = fechamento;
		return this;
	}
	
	public CandleBuilder comMinimo (Double minimo) {
		this.minimo = minimo;
		return this;	
	}
	
	public CandleBuilder comMaximo (Double maximo) {
		this.maximo = maximo;
		return this;
	}
	
	public CandleBuilder comVolume (Double volume) {
		this.volume = volume;
		return this;
	}
	
	public CandleBuilder comData (Calendar data) {
		this.data = data;
		return this;
	}
	
	public Candlestick geraCandle() {
		
		if (abertura == null || fechamento == null || minimo == null
				|| maximo == null || volume == null || data == null) {
			throw new IllegalStateException("Todos os atributos devem ser preenchidos");
		}
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	
	}
}
