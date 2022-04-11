package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Program to check employee is present or absent
 */
public class EmpPresentOrAbsent {

	public static void main(String[] args) {
		//constant
		int IS_FULL_TIME = 1;
		//cpmputation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}

	}

}
