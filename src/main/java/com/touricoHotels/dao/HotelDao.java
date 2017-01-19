package com.touricoHotels.dao;

import java.util.List;

import com.touricoHotels.model.Hotel;

public interface HotelDao {
	
	List<Hotel> findAllHotels();

}
