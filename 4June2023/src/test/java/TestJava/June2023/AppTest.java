package TestJava.June2023;

import static org.junit.Assert.assertTrue;

import javax.security.auth.callback.LanguageCallback;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
//		assertTrue(true);
//		System.out.println("True: "+true);
	
	
//	Languages ap;
	
	for(Languages a : Languages.values()) {
		
		System.out.println(a + " " + a.getCoders()+" coders");
		
	}
		
	}
	
	
}


enum Languages{
	
	Python(10-10+10*10), Java(9+9*9-9), Angular(12*12-12-12);
	private int coders;
	Languages(int p){
		
		coders = p;
		
	}
	int getCoders() {
		
		return coders;
		
	}
	
}

