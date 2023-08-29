package com.arm.service;

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
	public String registerCustomerData(CustomerDTO dto) throws Exception {
		System.out.println("CustomerServiceImpl.registerCustomerData()");
		Float interest = (dto.getPrincipalAmount() * dto.getTime() * dto.getRate()) / 100;
		Float totalAmount=dto.getPrincipalAmount()+interest;
		CustomerBO bo = new CustomerBO();
		bo.setName(dto.getName());
		bo.setPrincipalAmount(dto.getPrincipalAmount());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setInterest(interest);
		bo.setTotalAmount(totalAmount);
		int result = dao.insertCustomerData(bo);
		return result == 1 ? "Customer data having name " + dto.getName() + " registered successfully"
				: "Customer data having name " + dto.getName() + " registeration failed";
	}

}
