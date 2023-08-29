package com.arm.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 80905186637101493L;
	private Integer acNo;
	private String name;
	private Float principalAmount;
	private Float time;
	private Float rate;
	
	public Integer getAcNo() {
		return acNo;
	}

	public void setAcNo(Integer acNo) {
		this.acNo = acNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Float principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

}
