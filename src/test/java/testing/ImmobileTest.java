package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import auction.Auction;
import financeira.Financeira;
import products.Immobile;

class ImmobileTest {

	@Test
	void testConstructor() {
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "BANCAO-SIDNELSON");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
		Immobile i = new Immobile(2, 1500000.00, auction.getIdAuction(), "predio", "Av Paulista", 01310200, "Edificio Gonzaga");
		assertEquals(1, i.getAuction());	
	}

}
