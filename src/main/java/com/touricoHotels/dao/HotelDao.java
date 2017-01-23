package com.touricoHotels.dao;

import java.util.List;


import com.touricoHotels.model.VwOlimpusHotel;

public interface HotelDao {
	
	List<VwOlimpusHotel> findAllHotels();

}
