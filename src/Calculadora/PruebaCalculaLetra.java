package Calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class PruebaCalculaLetra {

	@Test
	public void test() {
		CalcularLetra c = new CalcularLetra("87634256");
		assertEquals('I', c.devolverLetra());
	}

}