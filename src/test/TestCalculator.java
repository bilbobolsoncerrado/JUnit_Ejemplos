package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.Calculator;

class TestCalculator {
	Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void testAdd() {
		 assertEquals(5, calculator.add(2, 3));

	}
	@Test
    public void testSubtract() {
        assertNotEquals(1, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() {
        assertTrue(calculator.multiply(3, 5) == 15);
        //assertFalse(calculator.multiply(3, 5) != 15);
    }

    
    @Test
    public void testDivide() {
        assertNotNull(calculator.divide(8, 4));
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
        assertThrows(IllegalArgumentException.class, ()->
        {
        	calculator.divide(10,0);
         });

    }


}
