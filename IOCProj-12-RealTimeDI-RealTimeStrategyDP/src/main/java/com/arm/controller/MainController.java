package com.arm.controller;

import com.arm.dto.EmployeeDTO;
import com.arm.service.IEmployeeMgmtService;
import com.arm.vo.EmployeeVO;

public class MainController {
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		super() ;
		System.out.println("MainController.MainController()");
		this.service = service;
	}

	public String processEmployee(EmployeeVO vo) throws Exception {
		// Convert EmployeeVO class object to EmployeeDTO class object
		EmployeeDTO dto = new EmployeeDTO();
		dto.seteName(vo.geteName());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		// Use service
		String result = service.registerEmployee(dto);
		return result;
	}

}
