package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;


import principal.Syso;

class TestSyso {
	Syso syso;
	private  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

	@BeforeEach
	void setUp() throws Exception {
		syso=new Syso();
	}
	@AfterEach
	void tearDown() throws Exception {
		syso=null;
	}
	
	@Test
	void testMostrar() {
		System.setOut(new PrintStream(outContent));
        
        syso.mostrar("Hola mundo");

        // Check the printed content
        assertEquals("Hola mundo", outContent.toString().trim());
        System.setOut(originalOut);

	}

}
