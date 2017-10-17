package br.com.caelum.argentum.testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.caelum.argentum.modelo.Negociacao;
import junit.framework.Assert;

public class NegociacaoTest {

	@Test
	public void dataDaNegociacaoEhImutavel() {
		// se criar um negocio no dia 15...
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negociacao n = new Negociacao(10, 5, c);
	}
		
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegociacaoComDataNula() {
		new Negociacao(10, 5, null);
	
	}

}
