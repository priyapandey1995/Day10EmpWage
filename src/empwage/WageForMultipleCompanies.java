package empwage;

public class WageForMultipleCompanies {

	public static void main(String[] args) {
		/**
		 * Creating objects for different companies initializing values for different companies
		 * calculating their wages
		 */
		System.out.println("Welcome to Employee Wage Problem ");
		System.out.println("\n<<<<<Reliance Employee Data>>>>>\n");
		EmpWage Myntra = new EmpWage();
		Myntra.Emp(20, 8, 4, 20, 100);

		System.out.println("\n<<<<<Flipkart Employee Data>>>>>\n");
		EmpWage Nykaa = new EmpWage();
		Nykaa.Emp(25, 10, 5, 28, 140);

		System.out.println("\n<<<<<Amazon Employee Data>>>>>\n");
		EmpWage Amazon = new EmpWage();
		Amazon.Emp(28, 12, 6, 25, 180);

		Company[] companies = new Company[3];
		companies[0] = new Company("Reliance", 20, 8, 4, 20, 100);
		companies[1] = new Company("Flipkart", 25, 10, 5, 28, 140);
		companies[2] = new Company("Amazon", 28, 12, 6, 25, 180);

	}
}

	


