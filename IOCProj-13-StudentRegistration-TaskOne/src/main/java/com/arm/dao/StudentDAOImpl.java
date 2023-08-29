package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.arm.bo.StudentBO;

public class StudentDAOImpl implements IStudentDAO {
	private static final String STUDENT_INSERTION_QUERY = "INSERT INTO STUDENT_DATA VALUES(STUDENT_ROLL_SEQ.NEXTVAL,?,?,?)";
	private DataSource dataSource;

	public StudentDAOImpl(DataSource dataSource) {
		super();
		System.out.println("StudentDAOImpl.StudentDAOImpl()");
		this.dataSource = dataSource;
	}

	@Override
	public int insertStudentData(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insertStudentData()");
		int result = 0;
		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement(STUDENT_INSERTION_QUERY)) {
			ps.setString(1, bo.getName());
			ps.setFloat(2, bo.getTotalMark());
			ps.setFloat(3, bo.getPercent());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}
