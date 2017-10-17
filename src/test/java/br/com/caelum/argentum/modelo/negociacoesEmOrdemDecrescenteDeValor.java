package br.com.caelum.argentum.modelo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class negociacoesEmOrdemDecrescenteDeValor {

	@Test
	public void test() {
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao2 = new Negociacao(42.3, 100, hoje);
		Negociacao negociacao3 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao4 = new Negociacao(39.8, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		Assert.assertEquals(45.0, candle.getAbertura(), 0.00001);
		Assert.assertEquals(39.8, candle.getFechamento(), 0.00001);
		Assert.assertEquals(39.8, candle.getMinimo(), 0.00001);
		Assert.assertEquals(45.0, candle.getMaximo(), 0.00001);
		Assert.assertEquals(16760.0, candle.getVolume(), 0.00001);	
	}
}
