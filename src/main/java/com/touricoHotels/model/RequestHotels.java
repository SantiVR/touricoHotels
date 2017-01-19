package com.touricoHotels.model;

public class RequestHotels {
	
	private String accommType;
	
	public RequestHotels(){}
	
	public RequestHotels(String accommoType){
		this.accommType = accommoType;
	}

	public String getAccommType() {
		return accommType;
	}

	public void setAccommType(String accommType) {
		this.accommType = accommType;
	}
	
	
	
}
