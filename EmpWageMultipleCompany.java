package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to compute employee wage for multiple companies
 */
public class EmpWageMultipleCompany {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private String company = "";
	private int empRatePerHour = 0;
	private int numOfWorkingDays = 0;
	private int maxHoursPerMonth = 0;
	//constructor
	public EmpWageMultipleCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public int empWage() {
		//variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		//condition of total working hour and days in month
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
			switch (empCheck) {
				case 1 :
					empHrs = 4;
					break;
				case 2 :
					empHrs = 8;
					break;
				default :
					empHrs = 0;
					break;
		}
			totalEmpHrs += empHrs;
		//	System.out.println("Days" + totalWorkingDays + "Emp_Hrs" + totalEmpHrs);
		}
		    int totalEmpWage = totalEmpHrs * empRatePerHour;
		    System.out.println("Total emp wage:" + company + " " + totalEmpWage);
		    return totalEmpWage;
	}
	
	public static void main(String[] args) {
		//object of class
		EmpWageMultipleCompany w1 = new EmpWageMultipleCompany("Reliance",20,20,100);
		w1.empWage(); // calling method
		EmpWageMultipleCompany w2 = new EmpWageMultipleCompany("Dmart",20,25,100);
		w2.empWage();

	}

}
