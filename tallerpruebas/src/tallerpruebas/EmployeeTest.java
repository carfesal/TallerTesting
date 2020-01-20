package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	
	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE MANAGER EN USD
	 */
	@Test
	void testCs_Manager_USD() {
		//test para Manager en USD 
		Employee M_USD = new Employee(400.f,"USD",0.5f,EmployeeType.Manager);
		assertEquals(464.68335f,M_USD.cs(),0.1f);		
	}
	
	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE WORKER EN USD
	 */
	@Test
	void testCs_Worker_USD() {
		//test para Worker USD
		Employee W_USD = new Employee(400.f,"USD",0.5f,EmployeeType.Worker);
		assertEquals(464.33334f,W_USD.cs(),0.1f);
	}
	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE SUPERVISOR EN USD
	 */
	@Test
	void testCs_Supervisor_USD() {
		//test para Supervisor 
		Employee S_USD = new Employee(400.f,"USD",0.5f,EmployeeType.Supervisor);
		assertEquals(464.5f,S_USD.cs(),0.1f);
	}
	
	
	
	
	

	@Test
	void testCalculateYearBonus() {
		fail("Not yet implemented");
	}

}
