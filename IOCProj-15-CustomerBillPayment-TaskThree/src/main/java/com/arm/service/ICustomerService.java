package com.arm.service;

import com.arm.dto.CustomerDTO;

public interface ICustomerService {
	public String registerCustomer(CustomerDTO dto)throws Exception;
}
