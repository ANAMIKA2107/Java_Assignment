package EmployeeRecordSystem;

public class Commissionemployee extends Employee {
	private double commisionPercentage;
	private double totalSales;

	public Commissionemployee(int id, String name, double commisionPercentage, double totalSales) {
		super(id, name);
		this.commisionPercentage = commisionPercentage;
		this.totalSales = totalSales;
	}

	@Override
	public double getPayment() {
		return totalSales * commisionPercentage / 100;
	}

}
