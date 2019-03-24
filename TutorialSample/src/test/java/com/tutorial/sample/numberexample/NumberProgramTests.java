/**
 * 
 */
package com.tutorial.sample.numberexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author suprithask
 *
 */
public class NumberProgramTests {
	
	NumberProgram n;
	
	@Before
	public void setup(){
		n = new NumberProgram();
	}
	@After
	public void tearDown(){
		n = null;
	}

	@Test
	public void summationTest(){
		n.setN1(5);
		n.setN2(5);
		assert n.summation()==10;
	}
	@Test
	public void greaterNumberTest(){
		int expectedValue = 10;
		int actualValue;
		n.setN1(10);
		n.setN2(5);
		
		actualValue = n.getGreaterNumber();
		assert expectedValue == actualValue;
		
	}
}
