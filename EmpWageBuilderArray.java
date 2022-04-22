package lp1emplwagecomputation;
/*
 * Author: Prasad
 * Ability to manage employee wage of multiple company 
 */
public class EmpWageBuilderArray {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0; //variable
	//Arraydeclaration
	private CompanyEmpWage empWageBuilderArray[];
	
	/*
	 * Constructor and declared size of array
	 */
	public EmpWageBuilderArray() {
		empWageBuilderArray = new CompanyEmpWage[5];
	}
	
	/*
	 * addCompanyEmpWage mathod to create different company
	 */
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHrsPerMonth) {
		empWageBuilderArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHrsPerMonth);
		numOfCompany++;
	}
	
	/*
	 * computeEmpWage method to save the total employee wage of company in array
	 */
	private void computeEmpWage() {
		for(int i = 0;i < numOfCompany; i++) {
			empWageBuilderArray[i].setTotalEmpWage(this.computeEmpWage(empWageBuilderArray[i]));
			System.out.println(empWageBuilderArray[i]);
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
		int TotalWage = totalEmpHrs * companyEmpWage.empRatePerHour;
		
//		System.out.println("Totalwage for  " + companyEmpWage.company + " is " +TotalWage );
		
		return (totalEmpHrs * companyEmpWage.empRatePerHour);
	}

	public static void main(String[] args) {
		//object
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Demart", 20, 15, 100);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 22, 110);
		empWageBuilder.computeEmpWage();
	}
}
