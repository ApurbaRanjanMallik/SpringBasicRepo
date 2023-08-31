package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.arm.bo.EmployeeBO;

public final class EmployeeOracleDAOImpl implements IEmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;

	public EmployeeOracleDAOImpl(DataSource ds) {
		super();
		System.out.println("EmployeeOracleDAOImpl.EmployeeOracleDAOImpl()");
		this.ds = ds;
	}

//	@Override
//	public int insertEmployee(EmployeeBO bo) throws Exception {
//
//		Connection con = null;
//		PreparedStatement ps = null;
//		int result;
//		try {
//			// get pooled Jdbc con object
//			con = ds.getConnection();
//			// Create PreparedStatement object having query as the pre-compiled SQL query
//			ps = con.prepareStatement(EMP_INSERT_QUERY);
//			// set values to query-params
//			ps.setString(1, bo.geteName());
//			ps.setString(2, bo.getDesg());
//			ps.setFloat(3, bo.getBasicSalary());
//			ps.setFloat(4, bo.getGrossSalary());
//			ps.setFloat(5, bo.getNetSalary());
//			result = ps.executeUpdate();
//		} catch (SQLException se) {
//			se.printStackTrace();
//			throw se;// Exception re-throwing
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;// Exception re-throwing
//		} finally {
//			try {
//				if (ps != null) {
//					ps.close();
//				}
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//			try {
//				if (ps != null) {
//					con.close();
//				}
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//		return result;
//	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeOracleDAOImpl.insertEmployee()");
		int result = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(EMP_INSERT_QUERY)) {
			ps.setString(1, bo.geteName());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			result = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}

}
