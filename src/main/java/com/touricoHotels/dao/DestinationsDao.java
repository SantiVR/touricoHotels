package com.touricoHotels.dao;

import java.util.List;

import com.touricoHotels.model.VwOlimpusDestination;

public interface DestinationsDao {
	
	List<VwOlimpusDestination> findAllDestinations();

}
