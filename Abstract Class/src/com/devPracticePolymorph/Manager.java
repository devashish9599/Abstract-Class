package com.devPracticePolymorph;

public class Manager extends Employee1 {
	//
	String dep;
	//
	public Manager(String dep,String name,int age, String contact,double salary) {
		this.dep=dep;
		super.age=age;
		super.Name=name;
		super.Contact=contact;
		super.Salary=salary;
		
		
		//
	
	}
	@Override
	public double TaxCalculate() {
		super.tax=(this.Salary*8)/100;
		return super.tax;
	}
	
	@Override
	public String toString() {
		return "Department: "+this.dep+", "+super.toString();
		
	}

		
	}

