package com.touricoHotels.model;

import java.util.List;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JacksonXmlRootElement(localName="touricoHotels")
public class ResponseSerhs {
	
	private List<VwOlimpusHotel> hotels;
	
	public ResponseSerhs(){}
	
	public ResponseSerhs(List<VwOlimpusHotel> hotels){
		this.hotels = hotels;
	}

	public List<VwOlimpusHotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<VwOlimpusHotel> hotels) {
		this.hotels = hotels;
	}
	
	

}
