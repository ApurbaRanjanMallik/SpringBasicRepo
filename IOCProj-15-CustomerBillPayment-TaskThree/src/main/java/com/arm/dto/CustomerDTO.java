package com.arm.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1300296368197506433L;
	private Integer customerId;
	private String customerName;
	private Float electricBill;
	private Float LPGBill;
	private Float waterBill;
	private Float discount;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Float getElectricBill() {
		return electricBill;
	}

	public void setElectricBill(Float electricBill) {
		this.electricBill = electricBill;
	}

	public Float getLPGBill() {
		return LPGBill;
	}

	public void setLPGBill(Float lPGBill) {
		LPGBill = lPGBill;
	}

	public Float getWaterBill() {
		return waterBill;
	}

	public void setWaterBill(Float waterBill) {
		this.waterBill = waterBill;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}
