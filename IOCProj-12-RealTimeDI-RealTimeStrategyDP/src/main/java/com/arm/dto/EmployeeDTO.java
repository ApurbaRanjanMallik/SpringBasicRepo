package com.arm.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4858052194200260770L;
	private Integer eNo;
	private String eName;
	private String desg;
	private Float basicSalary;

	public Integer geteNo() {
		return eNo;
	}

	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Float basicSalary) {
		this.basicSalary = basicSalary;
	}

}
