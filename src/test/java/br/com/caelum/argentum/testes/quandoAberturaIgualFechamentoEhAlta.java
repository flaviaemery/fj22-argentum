package br.com.caelum.argentum.testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class quandoAberturaIgualFechamentoEhAlta {

	@Test
	public void test() {
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(45.0, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		Assert.assertEquals(45.0, candle.getAbertura(), 0.00001);
		Assert.assertEquals(45.0, candle.getFechamento(), 0.00001);
		Assert.assertTrue(candle.isAlta());
		Assert.assertFalse(candle.isBaixa());
	}

}
