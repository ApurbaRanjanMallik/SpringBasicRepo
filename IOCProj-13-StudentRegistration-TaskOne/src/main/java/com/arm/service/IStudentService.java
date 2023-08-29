package com.arm.service;

import com.arm.dto.StudentDTO;

public interface IStudentService {
	public String registerStudent(StudentDTO dto)throws Exception;
}
