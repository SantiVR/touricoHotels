package com.touricoHotels.model;

import java.util.List;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JacksonXmlRootElement(localName="touricoHotels")
public class ResponseSerhs {

	private List<VwOlimpusHotel> hotels;
	private List<VwOlimpusDestination> destinations;

	public ResponseSerhs() {
	}

	public ResponseSerhs(List<VwOlimpusHotel> hotels, List<VwOlimpusDestination> destinations) {
		this.hotels = hotels;
		this.destinations = destinations;
	}
	
	public List<VwOlimpusDestination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<VwOlimpusDestination> destinations) {
		this.destinations = destinations;
	}

	public List<VwOlimpusHotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<VwOlimpusHotel> hotels) {
		this.hotels = hotels;
	}

}
