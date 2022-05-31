import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
			 
		int expected = 3;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBoundary() {
		int a = 9999;
		int b = 0;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.add(a, b);
	    
	    int expected1 = 9999;
		boolean expected2 = true;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testSubtractBoundary() {
		int a = 9999;
		int b = 0;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.subtract(a, b);
	    
	    int expected1 = 9999;
		boolean expected2 = true;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testMultiplyBoundary() {
		int a = 9999;
		int b = 0;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.multiply(a, b);
	    
	    int expected1 = 0;
		boolean expected2 = true;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testDivideBoundary() {
		int a = 9998;
		int b = 2;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.divide(a, b);
	    
	    int expected1 = 4999;
		boolean expected2 = true;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testAddError() {
		int a = -3;
		int b = 10000;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.add(a, b);
	    
	    int expected1 = 9997;
		boolean expected2 = false;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testSubtractError() {
		int a = -3;
		int b = 10000;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.subtract(a, b);
	    
	    int expected1 = -10003;
		boolean expected2 = false;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testMultiplyError() {
		int a = -3;
		int b = 10000;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.multiply(a, b);
	    
	    int expected1 = -30000;
		boolean expected2 = false;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@Test
	public void testDivideError() {
		int a = -3;
		int b = 10000;
			
		Calculator cal = new Calculator();
		boolean actual2 = cal.boundary(a,b); 
	    int actual1 = cal.divide(a, b);
	    
	    int expected1 = 0;
		boolean expected2 = false;
		
		assertEquals (expected2, actual2);
		assertEquals (expected1, actual1);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
