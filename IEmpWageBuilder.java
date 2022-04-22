package lp1emplwagecomputation;
/*
 * Author: Prasad
 */
public interface IEmpWageBuilder {
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHrsPerMonth);
	public void computeEmpWage();
}
