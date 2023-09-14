package com.arm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.arm.bo.TravellerBO;

public class TravellerDAOImpl implements ITravellerDAO {
	private static final String TRVLR_INSERT_QUERY = "INSERT INTO TRAVELLER_DETAILS VALUES(TNO_SEQ.NEXTVAL,?,?,?,?,?,?,?)";
	private DataSource ds;

	public TravellerDAOImpl(DataSource ds) {
		super();
		System.out.println("TravellerDAOImpl.TravellerDAOImpl()");
		this.ds = ds;
	}

	@Override
	public int insertTrvellerDetails(TravellerBO bo) throws Exception {
		System.out.println("TravellerDAOImpl.insertTrvellerDetails()");
		int result = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(TRVLR_INSERT_QUERY)) {
			ps.setString(1, bo.getName());
			ps.setString(2, bo.getPhNo());
			ps.setString(3, bo.getSource());
			ps.setString(4, bo.getDestination());
			ps.setFloat(5, bo.getDistance());
			ps.setFloat(6, bo.getPrice());
			ps.setString(7, bo.getMessage());
			result = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
