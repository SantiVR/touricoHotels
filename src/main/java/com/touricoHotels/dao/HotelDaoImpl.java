package com.touricoHotels.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.touricoHotels.model.VwOlimpusHotel;

public class HotelDaoImpl implements HotelDao{
	
	private SessionFactory sessionFactory;
	
	public void setSessionfactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<VwOlimpusHotel> findAllHotels() {
		Session session = this.sessionFactory.openSession();
		List<VwOlimpusHotel> hotelList = session.createQuery("from VwOlimpusHotel").list();
		session.close();
		return hotelList;
	}

}
