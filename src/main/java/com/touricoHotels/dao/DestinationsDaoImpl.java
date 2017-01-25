package com.touricoHotels.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.touricoHotels.model.VwOlimpusDestination;

public class DestinationsDaoImpl implements DestinationsDao {

private SessionFactory sessionFactory;
	
	public void setSessionfactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<VwOlimpusDestination> findAllDestinations() {
		Session session = this.sessionFactory.openSession();
		List<VwOlimpusDestination> destinationsList = session.createQuery("from VwOlimpusDestination").list();
		session.close();
		return destinationsList;
	}

}
