package lp1emplwagecomputation;
/*
 * Author: Prasad
 */
public class CompanyEmpWage {
	//variables
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalWage;
	
	//constructor
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
    
	//setter method
	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}		
	
	@Override
	public String toString() {
		return "Total Employee Wage for" + " " + company + " " + "is" + " " + totalWage;
	}
}
