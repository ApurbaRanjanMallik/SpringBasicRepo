package com.arm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.arm.dto.EmployeeDTO;
import com.arm.service.IEmployeeMgmtService;
import com.arm.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	@Autowired
	private IEmployeeMgmtService service;

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
