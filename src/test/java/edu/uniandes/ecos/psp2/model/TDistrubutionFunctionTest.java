package edu.uniandes.ecos.psp2.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TDistrubutionFunctionTest extends TestCase{
	
	public TDistrubutionFunctionTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(TDistrubutionFunctionTest.class);
	}
	
	public void testTDistrubitionFunction(){
		MathFunction tDistribution = new TDistributionFunction();
		try {
			assertEquals(0.38544, tDistribution.evaluateFunction("0.11", "9"), 0.00001);
			assertEquals(0.20652, tDistribution.evaluateFunction("1.1", "9"), 0.00001);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
