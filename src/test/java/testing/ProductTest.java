package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import auction.Auction;
import cliente.Cliente;
import dtos.LancesDTO;
import financeira.Financeira;
import products.Product;

class ProductTest {

	@Test
	void testConstructor() {
		
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "BANCAO-SIDNELSON");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
		Product p = new Product(1, 135000.00, 1, "BMW");
		assertEquals("BMW", p.getNome());
	}
	@Test
	void testMakeLance() {
		
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "BANCAO-SIDNELSON");
		Cliente c = new Cliente("Hawking", "s.hawking@xambridge.co.uk", "123456");
		Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira
        );
		
        Product p = new Product(1, 135000.00, 1, "BMW");
        p.makeLance(auction, c, 2000000.00, 1);  
        p.makeLance(auction, c, 3000000.00, 2);
        
        assertEquals(2, p.getLances().size());
	}

}
