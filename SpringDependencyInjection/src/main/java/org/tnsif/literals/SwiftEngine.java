package org.tnsif.literals;

public class SwiftEngine implements IEngine{

	private String company;
	private double cost;
	
	public double cost() {
		return cost;
	}

	public String display() {
		return "Japan";
	}
	
	
	//DI using constructor
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}

	
	//DI using getters and setters
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Origin of company:" + company + " " +fuel;
	}
	

}
