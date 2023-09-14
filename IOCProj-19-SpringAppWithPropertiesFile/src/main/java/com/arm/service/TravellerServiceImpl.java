package com.arm.service;

import com.arm.bo.TravellerBO;
import com.arm.dao.ITravellerDAO;
import com.arm.dto.TravellerDTO;

public class TravellerServiceImpl implements ITravellerService {
	private ITravellerDAO dao;

	public TravellerServiceImpl(ITravellerDAO dao) {
		super();
		System.out.println("TravellerServiceImpl.TravellerServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String registerTraveller(TravellerDTO dto) throws Exception {
		System.out.println("TravellerServiceImpl.registerTraveller()");
		Float price = dto.getDistance() * 1200;
		String message = "Hey... " + dto.getName()+"! Happy journey : )";
		TravellerBO bo = new TravellerBO();
		bo.setName(dto.getName());
		bo.setPhNo(dto.getPhNo());
		bo.setSource(dto.getSource());
		bo.setDestination(dto.getDestination());
		bo.setDistance(dto.getDistance());
		bo.setPrice(price);
		bo.setMessage(message);
		int count = dao.insertTrvellerDetails(bo);
		return count == 1 ? "Traveller details successfully inserted whose name is : " + bo.getName()
				: "Traveller details insertation failed whose name is : " + bo.getName();
	}

}
