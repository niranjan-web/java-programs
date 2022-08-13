package com.bean;

public class SportsCars {
	private String carBrandName;
	private String carName;
	private int carPrice;
	private String carEngineType;
	private int carTopSpeed;
	SportsBike bike;
	
	public SportsBike getBike() {
		return bike;
	}
	
	public void setBike(SportsBike bike) {
		this.bike = bike;
	}
	public String getCarBrandName() {
		return carBrandName;
	}
	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarEngineType() {
		return carEngineType;
	}
	public void setCarEngineType(String carEngineType) {
		this.carEngineType = carEngineType;
	}
	public int getCarTopSpeed() {
		return carTopSpeed;
	}
	public void setCarTopSpeed(int carTopSpeed) {
		this.carTopSpeed = carTopSpeed;
	}
	public SportsCars(String carBrandName, String carName, int carPrice, String carEngineType, int carTopSpeed) {
		super();
		this.carBrandName = carBrandName;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carEngineType = carEngineType;
		this.carTopSpeed = carTopSpeed;
	}
	public SportsCars() {
		super();
		
	}
	@Override
	public String toString() {
		return "SportsCars [carBrandName=" + carBrandName + ", carName=" + carName + ", carPrice=" + carPrice
				+ ", carEngineType=" + carEngineType + ", carTopSpeed=" + carTopSpeed + "]";
	}
}
