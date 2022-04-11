package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to calculate emp wage part time and full time
 */
public class EmpPartTimeAndFullTimeWage {

	public static void main(String[] args) {
		//Constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		
		//checking random condition
		if (empCheck == IS_PART_TIME) {
			empHrs = 4;
		}
		else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
		}
		else {
			empHrs = 0;
		}
		//calculating emp wage
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage :" + empWage);
	}
}
