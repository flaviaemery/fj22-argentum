package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {
	
	public Candlestick constroiCandleParaData(Calendar data,
					List<Negociacao> negociacoes) {
		Double maximo = Double.MIN_VALUE;
		Double minimo = Double.MAX_VALUE;
		Double volume = 0.0;
		
		for (Negociacao negociacao : negociacoes) {
			volume += negociacao.getVolume();
			
			if (negociacao.getPreco() > maximo) {
				maximo = negociacao.getPreco();
			} 
			
			if (negociacao.getPreco() < minimo) {
				minimo = negociacao.getPreco();
			}
		}
		
		Double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		Double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size()-1).getPreco();
		minimo = negociacoes.isEmpty() ? null : minimo;
		maximo = negociacoes.isEmpty() ? null : maximo;
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}

}
