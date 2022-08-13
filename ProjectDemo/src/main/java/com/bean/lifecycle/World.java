package com.bean.lifecycle;

public class World   {

	private String countryName;
	private String leaderName;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public World(String countryName, String leaderName) {
		super();
		this.countryName = countryName;
		this.leaderName = leaderName;
	}
	public World() {
		super();
		
	}
	private void init() {
		System.out.println("this is init method");
	}
//	private void des() {
//		System.out.println("this is destroy method");
//
//	}
//	@Override
//	public String toString() {
//		return "World [countryName=" + countryName + ", leaderName=" + leaderName + "]";
//	}
	
	

}
