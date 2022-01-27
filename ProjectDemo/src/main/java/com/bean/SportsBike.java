package com.bean;

public class SportsBike {
	private String bikeBrandName;
	private String bikeName;
	private int bikePrice;
	private String bikeEngineType;
	private int bikeTopSpeed;
	
	public String getBikeBrandName() {
		return bikeBrandName;
	}
	public void setBikeBrandName(String bikeBrandName) {
		this.bikeBrandName = bikeBrandName;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(int bikePrice) {
		this.bikePrice = bikePrice;
	}
	public String getBikeEngineType() {
		return bikeEngineType;
	}
	public void setBikeEngineType(String bikeEngineType) {
		this.bikeEngineType = bikeEngineType;
	}
	public int getBikeTopSpeed() {
		return bikeTopSpeed;
	}
	public void setBikeTopSpeed(int bikeTopSpeed) {
		this.bikeTopSpeed = bikeTopSpeed;
	}
	public SportsBike(String bikeBrandName, String bikeName, int bikePrice, String bikeEngineType, int bikeTopSpeed) {
		super();
		this.bikeBrandName = bikeBrandName;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.bikeEngineType = bikeEngineType;
		this.bikeTopSpeed = bikeTopSpeed;
	}
	public SportsBike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SportsBike [bikeBrandName=" + bikeBrandName + ", bikeName=" + bikeName + ", bikePrice=" + bikePrice
				+ ", bikeEngineType=" + bikeEngineType + ", bikeTopSpeed=" + bikeTopSpeed + "]";
	}
	
}
