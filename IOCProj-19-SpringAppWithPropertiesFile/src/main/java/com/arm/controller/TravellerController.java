package com.arm.controller;

import com.arm.dto.TravellerDTO;
import com.arm.service.ITravellerService;
import com.arm.vo.TravellerVO;

public class TravellerController {
	private ITravellerService service;

	public TravellerController(ITravellerService service) {
		super();
		System.out.println("TravellerController.TravellerController()");
		this.service = service;
	}

	public String processTravellerDetails(TravellerVO vo) throws Exception {
		System.out.println("TravellerController.processTravellerDetails()");
		TravellerDTO dto = new TravellerDTO();
		dto.setName(vo.getName());
		dto.setPhNo(vo.getPhNo());
		dto.setSource(vo.getSource());
		dto.setDestination(vo.getDestination());
		dto.setDistance(Float.parseFloat(vo.getDistance()));
		String status = service.registerTraveller(dto);
		return status;
	}

}
