package com.arm.dao;

import com.arm.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int insertEmployee(EmployeeBO bo) throws Exception;
}
