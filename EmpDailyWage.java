package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to calculate daily employee wage
 */
public class EmpDailyWage {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs;
		double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
        	empHrs = 8;
        }
        else  {
        	empHrs = 0;
        }
        int empWage = (empHrs * EMP_RATE_PER_HOUR);
        System.out.println("Emp wage :" + empWage);
	}
}
