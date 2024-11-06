package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class EmpEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  long empId;
	
	@Column
	private String empName;
	
	@Column
	private int  empSalary;
	
	@Column
	private String empDept;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	

}
/*{
 * "empId":"",
 * "empName":"",
 * "empSalary":"",
 * "empDept":""
 * }
 */
 
