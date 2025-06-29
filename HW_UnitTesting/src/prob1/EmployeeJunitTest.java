package prob1;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EmployeeJunitTest {
	
	
	@Test
	void testCase1() {
		Employee e1 = new Employee("Jhon", 10.0);
		e1.setHours(0,0);
		e1.setHours(1,0);
		e1.setHours(2,0);
		e1.setHours(3,0);
		e1.setHours(4,0);
		e1.setHours(5,0);
		e1.setHours(6,0);
		System.out.println("TEST CASE 1:  Expected Pay: $" + e1.getPay());
	}
	
	@Test
	void testCase2() {
		Employee e2 = new Employee("Jhon", 10.0);
		e2.setHours(0,0);
		e2.setHours(1,0);
		e2.setHours(2,0);
		e2.setHours(3,0);
		e2.setHours(4,0);
		e2.setHours(5,6);
		e2.setHours(6,0);
		System.out.println("TEST CASE 2:  Expected Pay: $" + e2.getPay());
	}
	
	@Test
	void testCase3() {
		Employee e3 = new Employee("Jhon", 10.0);
		e3.setHours(0,6);
		e3.setHours(1,4);
		e3.setHours(2,5);
		e3.setHours(3,6);
		e3.setHours(4,0);
		e3.setHours(5,0);
		e3.setHours(6,0);
		System.out.println("TEST CASE 3:  Expected Pay: $" + e3.getPay());
	}
}
