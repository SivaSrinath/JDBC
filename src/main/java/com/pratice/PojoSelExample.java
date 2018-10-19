package com.pratice;

public class PojoSelExample {

	private Long empId;
	private String name;
	private Double salary;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PojoSelExample [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
