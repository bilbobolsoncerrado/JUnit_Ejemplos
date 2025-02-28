package test;

import principal.Employee;
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;


public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() {
        // Create an instance of Employee before each test
     //   employee = new Employee(1L, "John Doe", 25);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, employee.getId().longValue());
    }

    @Test
    public void testSetId() {
        employee.setId(2L);
        assertEquals(2L, employee.getId().longValue());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", employee.getName());
    }

    @Test
    public void testSetName() {
        employee.setName("Jane Doe");
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(25, employee.getAge().intValue());
    }

    @Test
    public void testSetAge() {
        employee.setAge(30);
        assertEquals(30, employee.getAge().intValue());
    }

    @Test
    public void testDefaultConstructor() {
        Employee defaultEmployee = new Employee();
        assertNull(defaultEmployee.getId());
        assertNull(defaultEmployee.getName());
        assertNull(defaultEmployee.getAge());
    }

    @Test
    public void testParameterizedConstructor() {
        assertEquals(1L, employee.getId().longValue());
        assertEquals("John Doe", employee.getName());
        assertEquals(25, employee.getAge().intValue());
    }

  
}
