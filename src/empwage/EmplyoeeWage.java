package empwage;

public class EmplyoeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Program");
		
		int Is_present = 1;
		double empcheck = Math.floor((Math.random()*100)%2);
		if(empcheck == Is_present) 
			System.out.println("Emplyoee is present");
		else
			System.out.println("Emplyoee is absent");
		
		}

}
