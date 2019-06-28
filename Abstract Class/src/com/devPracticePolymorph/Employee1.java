package com.devPracticePolymorph;

public abstract class Employee1 {
	int id;
	String Name;
	String Contact;
	int age;
	int TempId=id;
	double Salary;
	double tax;
	
	// getter and setter of variables.
	
	public double getSalary() {
		return Salary;
	}
	//
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	//
	public String getName() {
		return Name;
	}
	//
	public void setName(String name) {
		this.Name = name;
	}
	//
	public String getContact() {
		return Contact;
	}
	//
	public void setContact(String contact) {
		this.Contact = contact;
	}
	//
	public int getAge() {
		return age;
	}
	//
	public void setAge(int age) {
		this.age = age;
	}
	
	//overriding toString method of object class.
	public String toString() {
		return "name: "+this.Name+", age: "+this.age+", contactNumber: "+this.Contact+", Salary: "+this.Salary+", TAX: "+this.tax;
	}
	
	//creating abstract method.
	public abstract double TaxCalculate();
}
