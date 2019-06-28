package com.devPracticePolymorph;
//
public class Runner {
//
	public static void main(String[] args) {
//	
//		
		Employee1 emp = new Employee1() {
//			
			@Override
			public double TaxCalculate() {
				this.tax = (this.Salary*5)/100;
				return this.tax;
			}
		};
//		
		Manager mobj = new Manager("HR", "Ashish", 20, "8920668833", 450000);
		Engineer eobj = new Engineer("Engineer", "Bhardwaj", 17, "7011134129", 250000);
//		
		emp.setName("Devashish");
		emp.setAge(22);
		emp.setContact("8920669977");
		emp.setSalary(50000);
		emp.TaxCalculate();
//		
		mobj.TaxCalculate();
		eobj.TaxCalculate();
//		
		System.out.println(emp);
		System.out.println(mobj);
//	
		System.out.println(eobj);
		emp.TaxCalculate();
	}
//
}
