package com.arm.service;

import com.arm.bo.StudentBO;
import com.arm.dao.IStudentDAO;
import com.arm.dto.StudentDTO;

public class StudentServiceImpl implements IStudentService {

	private IStudentDAO dao;

	public StudentServiceImpl(IStudentDAO dao) {
		super();
		System.out.println("StudentServiceIpl.StudentServiceIpl()");
		this.dao = dao;
	}

	@Override
	public String registerStudent(StudentDTO dto) throws Exception {
		System.out.println("StudentServiceIpl.registerStudent()");
		float percentage = dto.getTotalMark() / dto.getNoOfSubjects();
		// Prepare BO class object having persistable data
		StudentBO bo = new StudentBO();
		bo.setName(dto.getName());
		bo.setTotalMark(dto.getTotalMark());
		bo.setPercent(percentage);
		int count = dao.insertStudentData(bo);
		return count == 1
				? "Student registered having name " + dto.getName() + " and secured marks " + dto.getTotalMark()
						+ " Successfully"
				: "Student registartion failed having name" + dto.getName() + " and secured marks "
						+ dto.getTotalMark();
	}

}
