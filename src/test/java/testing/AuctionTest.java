package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import auction.Auction;
import financeira.Financeira;

class AuctionTest {

	@Test
	void testConstructor() {
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "Teste");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
        assertEquals("Rua Linconl", auction.getLocal());
	}

	@Test
	void testVehicle() {
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "BANCAO-SIDNELSON");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
       auction.registerNewVehicle(01, 135000.00, "X5", "passeio", 2018, "BMW");
       assertEquals(1, auction.getVehicles().size());
	}
	
	@Test
	void testRealEstate() {
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "BANCAO-SIDNELSON");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
       auction.registerNewImmobile(2, 1500000.00, "predio", "Av Paulista", 01310200, "Edificio Gonzaga");
       assertEquals(1, auction.getImmobilises().size());
	}

}
