package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest{

	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE WORKER EN MONEDA ALTERNA
	 */
	
	@Test
	void cambioMonedaWorker() {
		Employee e = new Employee((float)800.00, "EURO", (float)0.05, EmployeeType.Worker);
		assertEquals(824.33,e.cs(),0.1);
	}
	
	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE MANAGER EN MONEDA ALTERNA
	 */
	
	@Test
	void cambioMonedaManager() {
		Employee e = new Employee((float)2000.00, "EURO", (float)0.05, EmployeeType.Manager);
		assertEquals(1964.35,e.cs(),0.1);
	}
	
	/**
	 * METODO QUE TESTEA EL SALARIO CORRECTO DE SUPERVISOR EN MONEDA ALTERNA
	 */
	
	@Test
	void cambioMonedaWorkerSupervisor() {
		Employee e = new Employee((float)1000.00, "EURO", (float)0.05, EmployeeType.Supervisor);
		assertEquals(1014.36,e.cs(),0.1);
	}
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
	
	/**
	 * METODO QUE TESTEA EL BONO CORRECTO DE SUPERVISOR EN USD
	 */

	@Test
	void testCalculateYearBonusSupervisorUSD() {
		Employee e = new Employee(600.f,"USD",0.5f,EmployeeType.Supervisor);
		assertEquals(793,e.CalculateYearBonus(),0.1);
	}
	
	/**
	 * METODO QUE TESTEA EL BONO CORRECTO DE WORKER EN USD
	 */

	@Test
	void testCalculateYearBonusWorkerUSD() {
		Employee e = new Employee(400.f,"USD",0.5f,EmployeeType.Worker);
		assertEquals(386,e.CalculateYearBonus(),0.1);
	}
	
	/**
	 * METODO QUE TESTEA EL BONO CORRECTO DE MANAGER EN USD
	 */

	@Test
	void testCalculateYearBonusManagerUSD() {
		Employee e = new Employee(1200.f,"USD",0.5f,EmployeeType.Manager);
		assertEquals(1586,e.CalculateYearBonus(),0.1);
	}


}
