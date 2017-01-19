package com.touricoHotels.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.touricoHotels.model.Hotel;

public class HotelDaoImpl implements HotelDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionfactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	public List<Hotel> findAllHotels() {
		Session session = this.sessionFactory.openSession();
		List<Hotel> hotelList = session.createQuery("from VW_OLIMPUS_HOTELS").list();
		session.close();
		return hotelList;
	}

}
