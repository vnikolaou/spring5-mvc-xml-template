package com.pionware.starter.spring5.model;

public class Department {
	
	private Integer deptNo;
	private String deptName;
	
	public Department() {
		System.out.println("a department is created.");
	}
	
	public Department(Integer deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
