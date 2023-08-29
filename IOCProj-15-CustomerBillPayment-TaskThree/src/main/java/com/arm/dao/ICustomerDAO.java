package com.arm.dao;

import com.arm.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomerBillDetails(CustomerBO bo) throws Exception;
}
