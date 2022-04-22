package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Ability to save the total wage for each company
 */
public class SaveTotalEmpWage {
    //variables
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private String company = "";
	private int empRatePerHour = 0;
	private int numOfWorkingDays = 0;
	private int maxHoursPerMonth = 0;
	private int totalEmpWage;
	
	//constructor
	public SaveTotalEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
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
		}
		    totalEmpWage = totalEmpHrs * empRatePerHour;
		
		    return totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "TotalEmpWage for company: " + company + ", totalEmpWage=" + totalEmpWage;
	}
	
	public static void main(String[] args) {
		//object
	    SaveTotalEmpWage dMart = new SaveTotalEmpWage("Dmart", 20, 20, 100);
	    SaveTotalEmpWage bigBazar = new SaveTotalEmpWage("BigBazar", 25, 25, 110);
	    dMart.empWage();
	    System.out.println(dMart);
	    bigBazar.empWage();
	    System.out.println(bigBazar);    
	}
}
