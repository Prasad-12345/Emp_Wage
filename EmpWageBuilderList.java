package lp1emplwagecomputation;

import java.util.ArrayList;
/*
 * Author: Prasad
 * Refactor to have a list multiple companies to manage employee wage
 */
public class EmpWageBuilderList implements IEmpWageBuilder {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	//list
	private ArrayList<CompanyEmpWage> list;
	
	//constructor
	public EmpWageBuilderList() {
		list = new ArrayList<CompanyEmpWage>();
	}
	
	/*
	 * addCompanyEmpWage method to new different company
	 */
	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		CompanyEmpWage empWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHrsPerMonth);
		list.add(empWage);
	}

	/*
	 * computeEmpWage method to print total employee wage for company
	 */
	@Override
	public void computeEmpWage() {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).setTotalEmpWage(this.computeEmpWage(list.get(i)));
			System.out.println(list.get(i));
		}
	}
	
	/*
	 * method to calculate total employee wage for  company
	 */
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//variables
		int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
		
		//condition of total working hour and days in month
		while(totalEmpHrs <=companyEmpWage.maxHoursPerMonth && totalWorkingDays <=companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default :
				empHrs = 0;
				break;
			}
			totalEmpHrs+= empHrs;			
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		EmpWageBuilderList empWageBuilderList = new EmpWageBuilderList();
		empWageBuilderList.addCompanyEmpWage("Dmart", 25, 20, 100);
		empWageBuilderList.addCompanyEmpWage("Reliance", 22, 21, 110);	
		empWageBuilderList.computeEmpWage();
	}
}
