package com.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	Calculator2 cal;
	@Before
	public void setUp() throws Exception {
		cal=new Calculator2();
		
	}

	@Test
	public void test1() 
	{
		//assertEquals(3, cal.add(1, 2));
		//assertEquals(4, cal.add(1, 2));
		assertEquals(-1,cal.findMax(new int[] {-12,-1,-3,-4,-2}));
		assertEquals(4,cal.findMax(new int[] {1,3,4,2}));
		
		
	}
	@Test
	public void test2() 
	{
		//assertEquals(3, cal.add(1, 2));
		//assertEquals(4, cal.add(1, 2));
		assertEquals(4,cal.findMax(new int[] {-1,3,4,2}));
	}
	
	@After
	public void tearDown() throws Exception {
		cal=null;
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
