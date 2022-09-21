/**
 * 
 */
package example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


/**
 * @author orsys
 *
 */
class CalculatriceServiceTest {

	public CalculatriceService calculcatriceservice=new CalculatriceService();
	
	/**
	 * @throws java.lang.Exception
	 */
	//@BeforeAll
	void setUpBeforeClass() {
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	//@AfterAll
	void tearDownAfterClass()  {
		
		
	}

	@org.junit.jupiter.api.Test
	void test_soustraction() {
		// Etape 1 : Initialisation des paramétres
		int a = 27; 
		int b = 8;
		
		// Etape 2 : Appel du service à tester et stockage du résultat
		int resultat=calculcatriceservice.soustraction(a, b);

		// Etape 3 : Vérification du résultat
		assertEquals(19,resultat);
	}

	@org.junit.jupiter.api.Test
	void test_somme() {
		// Etape 1 : Initialisation des paramétres
		int a = 27; 
		int b = 8;
		
		// Etape 2 : Appel du service à tester et stockage du résultat
		int resultat=calculcatriceservice.somme(a, b);
		
		// Etape 3 : Vérification du résultat
		assertEquals(35,resultat);
		assertTrue(resultat>0);
		
		
	}
	

	@Test
	void test_template() {
		// Etape 1 : Initialisation des paramétres
		int a = 27; 
		int b = 8;
		
		// Etape 2 : Appel du service à tester et stockage du résultat
		int resultat=calculcatriceservice.somme(a, b);
		
		// Etape 3 : Vérification du résultat
		assertEquals(35,resultat);
		
		
		
	}
}
