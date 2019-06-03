package main;

import employee_stuff.Employee;

public class Hello {

	public static void main(String[] args) {
		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(12);


		emp1.setNumber(10);
		emp1.setName("Jeremy Smyth");
		emp1.setSalary(15000f);

		emp2.setNumber(12);
		emp2.setName("Matthew O'Reilly");
		emp2.setSalary(0.01f);

    System.out.println(emp1);
    System.out.println(emp2);
	}

}
