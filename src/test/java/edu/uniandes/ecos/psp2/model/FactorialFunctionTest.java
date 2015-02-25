package edu.uniandes.ecos.psp2.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Class to test <code>FactorialFunction</code> features
 * @author drenteria
 *
 */
public class FactorialFunctionTest extends TestCase {
	
	public FactorialFunctionTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(FactorialFunctionTest.class);
	}
	
	/**
	 * Evaluates against right parameters
	 */
	public void testEvaluateFactorialOk(){
		MathFunction factorial = new FactorialFunction();
		try {
			assertEquals(720D, factorial.evaluateFunction("6"), 0D);
			assertEquals(3628800D, factorial.evaluateFunction("10"), 0D);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}
	
	/**
	 * Evaluates against wrong parameters
	 */
	public void testEvaluateFactorialFail(){
		MathFunction factorial = new FactorialFunction();
		try {
			factorial.evaluateFunction("W");
		} catch (Exception e) {
			assertSame(IllegalArgumentException.class, e.getClass());
		}
		
	}

}
