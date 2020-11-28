package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import financeira.Financeira;

class FinanceiraTest {

	@Test
	void testConstructor() {
		Financeira f = new Financeira("1111111111111", "BANCAO-SIDNELSON");
		assertEquals("1111111111111", f.getCnpj());
	}

}
