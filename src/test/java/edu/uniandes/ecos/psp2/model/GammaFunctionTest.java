package edu.uniandes.ecos.psp2.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class tests the <code>GammaFunction</code> features
 * @author drenteria
 *
 */
public class GammaFunctionTest extends TestCase {
	
	public GammaFunctionTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(GammaFunctionTest.class);
	}
	
	public void testGammaFunctionInteger(){
		MathFunction gammaFunction = new GammaFunction();
		try {
			assertEquals(1, gammaFunction.evaluateFunction("1"), 0D);
			assertEquals(1, gammaFunction.evaluateFunction("2"), 0D);
			assertEquals(2, gammaFunction.evaluateFunction("3"), 0D);
			assertEquals(6, gammaFunction.evaluateFunction("4"), 0D);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	public void testGammaFunctionFraction(){
		MathFunction gammaFunction = new GammaFunction();
		try {
			assertEquals(0.886, gammaFunction.evaluateFunction("3", "2"), 0.001);
			assertEquals(1.329, gammaFunction.evaluateFunction("5", "2"), 0.001);
			assertEquals(3.323, gammaFunction.evaluateFunction("7", "2"), 0.001);
			assertEquals(11.63173, gammaFunction.evaluateFunction("9", "2"), 0.00001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
