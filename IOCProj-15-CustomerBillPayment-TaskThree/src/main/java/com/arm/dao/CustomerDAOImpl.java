package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.arm.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String query = "INSERT INTO CUSTOMER_BILL_DATA VALUES(CUSTOMER_ID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private DataSource dataSource;

	public CustomerDAOImpl(DataSource dataSource) {
		super();
		System.out.println("CustomerDAOImpl.CustomerDAOImpl()");
		this.dataSource = dataSource;
	}

	@Override
	public int insertCustomerBillDetails(CustomerBO bo) throws Exception {
		int result;
		try (Connection con = dataSource.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
			ps.setString(1, bo.getCustomerName());
			ps.setFloat(2, bo.getElectricBill());
			ps.setFloat(3, bo.getLPGBill());
			ps.setFloat(4, bo.getWaterBill());
			ps.setFloat(5, bo.getDiscount());
			ps.setFloat(6, bo.getTotalBill());
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
