package com.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

    Object[] expectedStudents = new Object[3];

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        expectedStudents[0] = new Student("John", 101, 20);
        expectedStudents[1] = new Student("Jane", 102, 21);
        expectedStudents[2] = new Student("Bob", 103, 22);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Object[] testOutput = Student.getStudentList().toArray();
        assertArrayEquals(expectedStudents, testOutput);
    }
}
