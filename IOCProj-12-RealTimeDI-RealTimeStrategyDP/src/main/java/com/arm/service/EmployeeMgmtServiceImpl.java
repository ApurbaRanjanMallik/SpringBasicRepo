package com.arm.service;

import com.arm.bo.EmployeeBO;
import com.arm.dao.IEmployeeDAO;
import com.arm.dto.EmployeeDTO;

public final class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	private IEmployeeDAO dao;

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		super();
		System.out.println("EmployeeMgmtServiceImpl.EmployeeMgmtServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeMgmtServiceImpl.registerEmployee()");
		// Write b.logic to calculate GrossSalary and NetSalary
		float grossSalary = dto.getBasicSalary() + dto.getBasicSalary() * 0.4f;
		float netSalary = grossSalary - dto.getBasicSalary() * 0.2f;
		// Prepare BO class object having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.seteName(dto.geteName());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		// Use DAO and Insert Employee data using BO
		int count = dao.insertEmployee(bo);
		// Generate final result
		return count == 1 ? "Employee registered with net salary :" + netSalary
				: "Employee registered failed having net salary :" + netSalary;

	}

}
