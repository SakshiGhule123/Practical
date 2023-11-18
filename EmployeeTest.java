package com.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	
	Object[] expectedEmps = new Object[3];
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		expectedEmps[0] = new Employee("padmaja",1,2324);
		expectedEmps[1] = new Employee("Radhika",2,2632);
		expectedEmps[2] = new Employee("Punam",3,2634);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Object[] testOutput = Employee.getEmployeeList().toArray();
		assertArrayEqauals(expectedEmps,testOutput);
	}

	private void assertArrayEqauals(Object[] expectedEmps2, Object[] testOutput) {
		// TODO Auto-generated method stub
		
	}

}
