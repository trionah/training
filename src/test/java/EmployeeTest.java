package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import employee_stuff.Employee; 

class EmployeeTest {

	@Test
	void testEmployeeInt() {
		Employee e = new Employee(15);
		assertEquals(15, e.getNumber());
	}

	@Test
	void testEmployeeIntString() {
		Employee e = new Employee(15, "Henry Banana");
		assertEquals(15, e.getNumber());
		assertEquals("Henry Banana", e.getName());
	}

	@Test
	void testEmployeeIntStringFloat() {
		Employee e = new Employee(15, "Henry Banana", 20000f);
		assertEquals(15, e.getNumber());
		assertEquals("Henry Banana", e.getName());
		assertEquals(20000f, e.getSalary(), 0.000001);
	}
	
	@Test
	void testSalaryBigChange() {
		Employee e = new Employee(15, "Henry Banana");
		e.setSalary(8000);
		assertEquals(8000, e.getSalary());
	}

}
