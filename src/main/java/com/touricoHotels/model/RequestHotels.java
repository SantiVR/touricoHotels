package com.touricoHotels.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="hotelList")
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
