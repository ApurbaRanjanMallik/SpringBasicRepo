package com.arm.controller;

import com.arm.dto.CustomerDTO;
import com.arm.service.ICustomerService;
import com.arm.vo.CustomerVO;

public class CustomerController {
	private ICustomerService service;

	public CustomerController(ICustomerService service) {
		super();
		System.out.println("CustomerController.CustomerController()");
		this.service = service;
	}

	public String processCustomerData(CustomerVO vo) throws Exception {
		System.out.println("CustomerController.processCustomerData()");
		CustomerDTO dto = new CustomerDTO();
		dto.setName(vo.getName());
		dto.setPrincipalAmount(Float.parseFloat(vo.getPrincipalAmount()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		String message = service.registerCustomerData(dto);
		return message;

	}

}
