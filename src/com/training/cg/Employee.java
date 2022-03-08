package com.training.cg;

public class Employee {
	private String empId;
	private String empName;
	private String empDept;
	private String empSalary;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		if(empSalary < 20000) {
			System.out.println("Salary cannot be less than 20000");
		}
		this.empSalary = Integer.toString(empSalary);
	}
}
