package br.com.caelum.argentum.modelo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class semNegociacoesGeraCandleComZeros {

	@Test
	public void semNegociacoesGeraCandleComZeros() {
		Calendar hoje = Calendar.getInstance();
		
		List<Negociacao> negociacoes = Arrays.asList();
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		Assert.assertEquals(0, candle.getMaximo(), 0.00001);
		Assert.assertEquals(0, candle.getMinimo(), 0.00001);
		Assert.assertEquals(0, candle.getFechamento(), 0.00001);
		Assert.assertEquals(0, candle.getAbertura(), 0.00001);
		Assert.assertEquals(0.0, candle.getVolume(), 0.00001);
	}

}
