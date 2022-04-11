package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to calculate wages till a condition of total working hour or days is reached for a month
 */
public class EmpTotalMonthlyWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		//variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		//condition of total working hour and days in month
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
			System.out.println("Days" + totalWorkingDays + "Emp_Hrs" + totalEmpHrs);
		}
		    int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		    System.out.println("Total emp wage:" + totalEmpWage);
	}

}
