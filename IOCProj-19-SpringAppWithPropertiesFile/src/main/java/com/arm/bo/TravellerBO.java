package com.arm.bo;

public class TravellerBO {
	private Integer travellerNo;
	private String name;
	private String phNo;
	private String source;
	private String destination;
	private Float distance;
	private Float price;
	private String message;

	public Integer getTravellerNo() {
		return travellerNo;
	}

	public void setTravellerNo(Integer travellerNo) {
		this.travellerNo = travellerNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
