package com.arm.controller;

import com.arm.dto.CustomerDTO;
import com.arm.service.CustomerServiceImpl;
import com.arm.vo.CustomerVO;

public class CustomerController {
	private CustomerServiceImpl service;

	public CustomerController(CustomerServiceImpl service) {
		super();
		System.out.println("CustomerController.CustomerController()");
		this.service = service;
	}

	public String processBillDetails(CustomerVO vo) throws Exception {
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setElectricBill(Float.parseFloat(vo.getElectricBill()));
		dto.setLPGBill(Float.parseFloat(vo.getLPGBill()));
		dto.setWaterBill(Float.parseFloat(vo.getWaterBill()));
		dto.setDiscount(Float.parseFloat(vo.getDiscount()));
		String message = service.registerCustomer(dto);
		return message;

	}

}
