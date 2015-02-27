package edu.uniandes.ecos.psp2.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author drenteria
 *
 */
public class SimpsonRuleIntegrationTest extends TestCase {
	
	SimpsonRuleIntegration testIntegrator = null;
	
	public SimpsonRuleIntegrationTest(String testName){
		super(testName);
		testIntegrator = new SimpsonRuleIntegration(2, 0, 0.0, 0);
	}
	
	public static Test suite(){
		return new TestSuite(SimpsonRuleIntegrationTest.class);
	}
	
	public void testSimpsonRuleIntegration(){
		try {
			assertEquals(0.35006, executeTest1(), 0.00001);
			assertEquals(0.36757, executeTest2(), 0.00001);
			assertEquals(0.49500, executeTest3(), 0.00001);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	private double executeTest1() throws Exception{
		SimpsonRuleIntegration testIntegrator = new SimpsonRuleIntegration(10, 1.1, 0.00001, 9);
		return testIntegrator.getIntegralApproximation();
	}
	
	private double executeTest2() throws Exception{
		SimpsonRuleIntegration testIntegrator = new SimpsonRuleIntegration(10, 1.1812, 0.001, 10);
		return testIntegrator.getIntegralApproximation();
	}
	
	private double executeTest3() throws Exception{
		SimpsonRuleIntegration testIntegrator = new SimpsonRuleIntegration(10, 2.750, 0.001, 30);
		return testIntegrator.getIntegralApproximation();
	}

}
