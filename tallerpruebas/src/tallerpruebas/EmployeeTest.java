package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest{

	@Test
	void cambioMonedaWorker() {
		Employee e = new Employee((float)800.00, "EURO", (float)0.05, EmployeeType.Worker);
		assertEquals(824.33,e.cs(),0.1);
	}
	
	@Test
	void cambioMonedaManager() {
		Employee e = new Employee((float)2000.00, "EURO", (float)0.05, EmployeeType.Manager);
		assertEquals(1964.35,e.cs(),0.1);
	}
	
	@Test
	void cambioMonedaWorkerSupervisor() {
		Employee e = new Employee((float)1000.00, "EURO", (float)0.05, EmployeeType.Supervisor);
		assertEquals(1014.36,e.cs(),0.1);
	}
	

}
