package Model;

import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CuentaTest {
		
	@Test
	public void testNombreCuenta() {
		Cuenta cuenta= new Cuenta("Fernando", new BigDecimal("1000.89"));
		assertEquals("Fernando", cuenta.getPersona());
		assertTrue(cuenta.getSaldo().toString().equals("1000.89"));
	}

	@Test
	public void testReferenciaCuenta() {
		Cuenta cuenta1= new Cuenta("Fernando", new BigDecimal("12000.00"));
		Cuenta cuenta2= new Cuenta("Fernando", new BigDecimal("5000.00"));
		
		assertEquals(cuenta1, cuenta2);
	}
	
	@Test
	public void testDebitoCuenta() {
		Cuenta cuenta2= new Cuenta("Daniel", new BigDecimal("5000.00"));
		cuenta2.debito(new BigDecimal("2000.00"));
		
		assertNotNull(cuenta2.getSaldo());
		assertEquals("3000.00", cuenta2.getSaldo().toPlainString());
		assertEquals(3000, cuenta2.getSaldo().intValue());
		
	}
	
	@Test
	public void testCreditoCuenta() {
		Cuenta cuenta= new Cuenta("Pedro", new BigDecimal("3000.00"));
		cuenta.credito(new BigDecimal("1000.00"));
		
		assertNotNull(cuenta.getSaldo());
		assertEquals("4000.00", cuenta.getSaldo().toPlainString());
		assertEquals(4000, cuenta.getSaldo().intValue());
		
	}
	
}
