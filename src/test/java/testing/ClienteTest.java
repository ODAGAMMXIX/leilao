package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import auction.Auction;
import cliente.Cliente;
import dtos.LancesDTO;
import financeira.Financeira;

class ClienteTest {

	@Test
	void testConstructor() {
		Cliente c = new Cliente("Hawking", "s.hawking@xambridge.co.uk", "123456");
		assertEquals("Hawking", c.getNome());
	}
	@Test 
	void testLanceCliente() {
		LocalDate newDate = LocalDate.parse("2020-01-01");
		Financeira financeira = new Financeira("123456", "Teste");
		Cliente c = new Cliente("Hawking", "s.hawking@xambridge.co.uk", "123456");
        Auction auction = new Auction(
                1, newDate, "Rua Linconl",
                "Caçapava", "São Paulo", financeira                
        );
        LancesDTO l = new LancesDTO(c, 140000.00, auction);
        c.inserirLance(l);
        assertEquals(1, c.getLances().size());
	}
	
}
