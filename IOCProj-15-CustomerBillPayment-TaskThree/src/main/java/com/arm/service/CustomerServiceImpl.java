package com.arm.service;

import java.sql.SQLException;

import com.arm.bo.CustomerBO;
import com.arm.dao.ICustomerDAO;
import com.arm.dto.CustomerDTO;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDAO dao;

	public CustomerServiceImpl(ICustomerDAO dao) {
		super();
		System.out.println("CustomerServiceImpl.CustomerServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerServiceImpl.registerCustomer()");
		int result;
		Float billWODisc = dto.getElectricBill() + dto.getLPGBill() + dto.getWaterBill();
		Float totalBillAmount = billWODisc-(billWODisc * (dto.getDiscount() / 100));
		CustomerBO bo = new CustomerBO();
		bo.setCustomerName(dto.getCustomerName());
		bo.setElectricBill(dto.getElectricBill());
		bo.setLPGBill(dto.getLPGBill());
		bo.setWaterBill(dto.getWaterBill());
		bo.setDiscount(dto.getDiscount());
		bo.setTotalBill(totalBillAmount);
		try {
			result = dao.insertCustomerBillDetails(bo);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result == 1
				? "Customer name : " + dto.getCustomerName() + " and total bill amount : " + totalBillAmount
						+ " has registered successfully"
				: "Customer name : " + dto.getCustomerName() + " and total bill amount : " + totalBillAmount
						+ " registeration failed";
	}

}
