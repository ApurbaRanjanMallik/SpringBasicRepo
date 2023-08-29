package com.arm.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8340591801580161927L;
	private Integer rollNo;
	private String name;
	private Float totalMark;
	private Integer noOfSubjects;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(Float totalMark) {
		this.totalMark = totalMark;
	}

	public Integer getNoOfSubjects() {
		return noOfSubjects;
	}

	public void setNoOfSubjects(Integer noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}

}
