package br.com.caelum.argentum.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.caelum.argentum.modelo.CandleBuilder;

public class CandleBuilderTest {

	@Test(expected = IllegalStateException.class)
	public void geracaoDeCandleDeveTerTodosOsDadosNecessarios() {
		
		CandleBuilder builder = new CandleBuilder();
		
		builder.geraCandle();
	}

}
