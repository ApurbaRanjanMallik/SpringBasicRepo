package com.arm.service;

import com.arm.dto.CustomerDTO;

public interface ICustomerService {
	public String registerCustomerData(CustomerDTO dto)throws Exception;
}
