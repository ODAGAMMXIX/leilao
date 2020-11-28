package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import products.Vehicle;

class VehicleTest {

	@Test
	void testConstructor() {

		Vehicle v = new Vehicle(01, 1500000.00, 1, "carga", "FORD CARGO", 2018, "OPTIMUS PRIME");
		assertEquals("FORD CARGO", v.getModel());
	}

}
