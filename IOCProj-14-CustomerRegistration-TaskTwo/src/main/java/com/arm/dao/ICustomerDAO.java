package com.arm.dao;

import com.arm.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomerData(CustomerBO bo) throws Exception;
}
