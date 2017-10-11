package br.com.caelum.argentum.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.caelum.argentum.modelo.CandleBuilder;
import br.com.caelum.argentum.modelo.Candlestick;

public class TestaCandleBuilder {

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data.toString());
		Calendar hoje = Calendar.getInstance();
		
		CandleBuilder builder = new CandleBuilder();
		
		builder.comAbertura(40.5);
		builder.comFechamento(42.3);
		builder.comMinimo(39.8);
		builder.comMaximo(45.0);
		builder.comVolume(145234.20);
		builder.comData(new GregorianCalendar(2012, 8, 12, 0, 0, 0));
		
		Candlestick candle =builder.geraCandle();
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		String dataEmString = dataFormatada.format(data);

		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
		System.out.println(dataEmString);
	}

}
