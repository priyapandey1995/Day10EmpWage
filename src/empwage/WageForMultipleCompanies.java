package empwage;

public class WageForMultipleCompanies {

	public static void main(String[] args) {
				/**
				 * initializing values for different companies
				 * calculating their wages
				 */
				System.out.println("Welcome to Employee Wage Problem ");
				System.out.println("Reliance Employee Data ");
				EmpWage Myntra = new EmpWage();
				Myntra.Emp(20, 8, 4, 20, 100);

				System.out.println("\n Flipkart Employee Data ");
				EmpWage Amazon = new EmpWage();
				Amazon.Emp(25, 10, 5, 28, 140);

				System.out.println("\n Amazon Employee Data ");
				EmpWage Nykaa = new EmpWage();
				Nykaa.Emp(28, 12, 6, 25, 180);
			}
		}

	


