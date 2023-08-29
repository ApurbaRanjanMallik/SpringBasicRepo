package com.arm.vo;

public class CustomerVO {
	private String customerId;
	private String customerName;
	private String electricBill;
	private String LPGBill;
	private String waterBill;
	private String discount;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getElectricBill() {
		return electricBill;
	}

	public void setElectricBill(String electricBill) {
		this.electricBill = electricBill;
	}

	public String getLPGBill() {
		return LPGBill;
	}

	public void setLPGBill(String lPGBill) {
		LPGBill = lPGBill;
	}

	public String getWaterBill() {
		return waterBill;
	}

	public void setWaterBill(String waterBill) {
		this.waterBill = waterBill;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
