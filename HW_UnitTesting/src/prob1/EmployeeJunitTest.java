package prob1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeJunitTest {
	
	static Employee e;
	
	@BeforeAll
	static void TheEmployee() {
		e = new Employee("Gavin", 10.0);
	}
	
	@Test
	void testCase1() {
		e.setHours(0,0);
		e.setHours(1,0);
		e.setHours(2,0);
		e.setHours(3,0);
		e.setHours(4,0);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 1:  Expected Pay: $0.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase2() {
		e.setHours(0,0);
		e.setHours(1,0);
		e.setHours(2,0);
		e.setHours(3,0);
		e.setHours(4,0);
		e.setHours(5,6);
		e.setHours(6,0);
		System.out.println("TEST CASE 2:  Expected Pay: $120.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase3() {
		e.setHours(0,6);
		e.setHours(1,4);
		e.setHours(2,5);
		e.setHours(3,6);
		e.setHours(4,0);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 3:  Expected Pay: $210.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase4() {
		e.setHours(0,9);
		e.setHours(1,8);
		e.setHours(2,7);
		e.setHours(3,10);
		e.setHours(4,9);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 4:  Expected Pay: $445.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase5() {
		e.setHours(0,4);
		e.setHours(1,5);
		e.setHours(2,0);
		e.setHours(3,7);
		e.setHours(4,8);
		e.setHours(5,0);
		e.setHours(6,9);
		System.out.println("TEST CASE 5:  Expected Pay: $420.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase6() {
		e.setHours(0,9);
		e.setHours(1,0);
		e.setHours(2,9);
		e.setHours(3,9);
		e.setHours(4,9);
		e.setHours(5,9);
		e.setHours(6,0);
		System.out.println("TEST CASE 6:  Expected Pay: $540.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase7() {
		e.setHours(0,6);
		e.setHours(1,7);
		e.setHours(2,6);
		e.setHours(3,8);
		e.setHours(4,9);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 7:  Expected Pay: $360.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase8() {
		e.setHours(0,8);
		e.setHours(1,8);
		e.setHours(2,8);
		e.setHours(3,8);
		e.setHours(4,8);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 8:  Expected Pay: $400.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase9() {
		e.setHours(0,9);
		e.setHours(1,10);
		e.setHours(2,9);
		e.setHours(3,10);
		e.setHours(4,8);
		e.setHours(5,0);
		e.setHours(6,0);
		System.out.println("TEST CASE 9:  Expected Pay: $490.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase10() {
		e.setHours(0,6);
		e.setHours(1,5);
		e.setHours(2,8);
		e.setHours(3,10);
		e.setHours(4,4);
		e.setHours(5,0);
		e.setHours(6,5);
		System.out.println("TEST CASE 10:  Expected Pay: $430.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase11() {
		e.setHours(0,10);
		e.setHours(1,6);
		e.setHours(2,8);
		e.setHours(3,6);
		e.setHours(4,9);
		e.setHours(5,7);
		e.setHours(6,0);
		System.out.println("TEST CASE 11:  Expected Pay: $53.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase12() {
		e.setHours(0,5);
		e.setHours(1,5);
		e.setHours(2,6);
		e.setHours(3,6);
		e.setHours(4,5);
		e.setHours(5,6);
		e.setHours(6,6);
		System.out.println("TEST CASE 12:  Expected Pay: $560.0 | Actual Pay: $" + e.getPay());
	}
	
	@Test
	void testCase13() {
		e.setHours(0,7);
		e.setHours(1,6);
		e.setHours(2,6);
		e.setHours(3,6);
		e.setHours(4,6);
		e.setHours(5,5);
		e.setHours(6,7);
		System.out.println("TEST CASE 13:  Expected Pay: $600.0 | Actual Pay: $" + e.getPay());
	}
}
