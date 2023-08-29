package com.arm.controller;

import com.arm.dto.StudentDTO;
import com.arm.service.IStudentService;
import com.arm.vo.StudentVO;

public class StudentController {
	private IStudentService service;

	public StudentController(IStudentService service) {
		super();
		this.service = service;
	}

	public String processStudentData(StudentVO vo) throws Exception {
		System.out.println("StudentController.processStudentData()");
		StudentDTO dto = new StudentDTO();
		dto.setName(vo.getName());
		dto.setTotalMark(Float.parseFloat(vo.getTotalMark()));
		dto.setNoOfSubjects(Integer.parseInt(vo.getNoOfSubjects()));
		String message = service.registerStudent(dto);
		return message;
	}
}
