package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to calculate employee wage using switch case statement
 */
public class EmpUsingCaseWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
	    //variables
		int empHrs = 0;
		int empWage = 0;
		//computation
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
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp wage :" + empWage);
	}
}