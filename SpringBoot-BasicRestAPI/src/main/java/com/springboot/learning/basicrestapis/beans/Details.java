package com.springboot.learning.basicrestapis.beans;


public class Details {
	private String city;
	private String state;
	private String mobileNo;
	
	
	
	public Details(String city, String state, String mobileNo) {
		super();
		this.city = city;
		this.state = state;
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Details [city=" + city + ", state=" + state + ", mobileNo=" + mobileNo + "]";
	}
	
	

	
	
}
