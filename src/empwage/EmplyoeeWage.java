package empwage;

public class EmplyoeeWage {

	public static void main(String[] args) {
		
		int Is_present = 1;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int dailywage = wagePerHour * fullDayHour;
		double empcheck = Math.floor((Math.random()*100)%3);
		if(empcheck == 1) {
			System.out.println("Emplyoee is present");
			System.out.println("Daily wage of Emplyoee is" + dailywage);
		}	
		else if(empcheck == 0 ){
			System.out.println("Emplyoee is absent");
		}
		else {
			System.out.println("Emplyoee is present for the half day");
		}
		
		}

}
