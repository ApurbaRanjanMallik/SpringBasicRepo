package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.arm.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String query = "INSERT INTO CUSTOMER_DATA VALUES(CUSTOMER_ACNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource source;

	public CustomerDAOImpl(DataSource source) {
		super();
		System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
		this.source = source;
	}

	@Override
	public int insertCustomerData(CustomerBO bo) throws Exception {
		System.out.println("CustomerDAOImpl.inserCustomerData()");
		int result=0;
		try (Connection con = source.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
			ps.setString(1, bo.getName());
			ps.setFloat(2, bo.getPrincipalAmount());
			ps.setFloat(3, bo.getTime());
			ps.setFloat(4, bo.getRate());
			ps.setFloat(5, bo.getInterest());
			ps.setFloat(6, bo.getTotalAmount());
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
