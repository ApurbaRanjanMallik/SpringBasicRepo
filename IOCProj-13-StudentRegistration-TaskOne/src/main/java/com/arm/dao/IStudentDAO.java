package com.arm.dao;

import com.arm.bo.StudentBO;

public interface IStudentDAO {
	public int insertStudentData(StudentBO bo)throws Exception;
}
