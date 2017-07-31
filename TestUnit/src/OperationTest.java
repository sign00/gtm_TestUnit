import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class OperationTest {

	@Test
	public void testAddition() {
		//fail("Not yet implemented");
		
		int resultat = Operation.addition(10, 12);
		Assert.assertEquals("ERREUR ADDITION", 22, resultat, 0);
		
	}

	@Test
	public void testSoustraction() {
		//fail("Not yet implemented");
		
		int resultat = Operation.soustraction(10, 12);
		Assert.assertEquals("ERREUR SOUSTRACTION", -2, resultat, 0);
	}

	@Test
	public void testMultiplication() {
		//fail("Not yet implemented");
		
		int resultat = Operation.multiplication(10, 12);
		Assert.assertEquals("ERREUR MULTIPLICATION", 120, resultat, 0);
	}

	@Test
	public void testDivision() {
		//fail("Not yet implemented");
		
		int resultat = Operation.division(100, 12);
		Assert.assertEquals("ERREUR DIVISION", 8, resultat, 0);
	}

}
