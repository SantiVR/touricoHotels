package com.touricoHotels.model;

import java.util.List;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JacksonXmlRootElement(localName="touricoHotels")
public class ResponseSerhs {
	
	private List<Hotel> hotels;
	
	public ResponseSerhs(){}
	
	public ResponseSerhs(List<Hotel> hotels){
		this.hotels = hotels;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	

}
