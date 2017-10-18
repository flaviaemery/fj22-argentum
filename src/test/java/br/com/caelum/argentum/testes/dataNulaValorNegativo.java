package br.com.caelum.argentum.testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.caelum.argentum.modelo.Candlestick;

public class dataNulaValorNegativo {

	@Test
	public void test() {
		Candlestick c = new Candlestick(10.0, 20.0, -10.0, 20.0, 10000.0, null);
	}
}
