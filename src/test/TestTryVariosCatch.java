package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import principal.TryVariosCatch;

class TestTryVariosCatch {
	private  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    TryVariosCatch trio;
    private int[] arr;

	@BeforeEach
	void setUp() throws Exception {
		trio=new TryVariosCatch();
		arr= new int[10];
	}
	

	@AfterEach
	void tearDown() throws Exception {
		trio=null;
		arr=null;
	}
	
	@Test
	void testWriteListFalse() {
		assertFalse(trio.writeListFalse(10, arr));
		assertTrue(trio.writeListFalse(0, arr));
	}
	@Test
	void testWriteListSyso() {
	
		System.setOut(new PrintStream(outContent));
        
        trio.writeListSyso(10, arr);

        // Check the printed content
        assertEquals("Intento de acceso a un índice fuera del array", outContent.toString().trim());
        System.setOut(originalOut);
	}

}
