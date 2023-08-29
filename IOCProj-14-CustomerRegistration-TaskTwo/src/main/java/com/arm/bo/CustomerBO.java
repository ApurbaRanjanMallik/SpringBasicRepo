package com.arm.bo;

public class CustomerBO {
	private Integer acNo;
	private String name;
	private Float principalAmount;
	private Float time;
	private Float rate;
	private Float interest;
	private Float totalAmount;

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

	public Float getInterest() {
		return interest;
	}

	public void setInterest(Float interest) {
		this.interest = interest;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

}
