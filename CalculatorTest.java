package com.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
		
	}

	@Test
	public void test1() 
	{
		//assertEquals(3, cal.add(1, 2));
		//assertEquals(4, cal.add(1, 2));
		
	}
	@Test
	public void test2() 
	{
		 assertTrue(cal.Even(2));
	        assertFalse(cal.Even(3));
	}
	
	@After
	public void tearDown() throws Exception {
		cal=null;
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
