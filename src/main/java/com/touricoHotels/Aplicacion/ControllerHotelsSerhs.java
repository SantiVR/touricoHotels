package com.touricoHotels.Aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.touricoHotels.dao.DestinationsDao;
import com.touricoHotels.dao.HotelDao;
import com.touricoHotels.model.ResponseSerhs;
import com.touricoHotels.model.VwOlimpusDestination;
import com.touricoHotels.model.VwOlimpusHotel;


@RestController
public class ControllerHotelsSerhs {

	@Autowired
	private Environment env;

	private ResponseSerhs responseSerhs;

	public ControllerHotelsSerhs() {
	}

	@Autowired
	public ControllerHotelsSerhs(Environment env) {
		this.env = env;
	}

	@RequestMapping(value="/serhs/olimpus/hotels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getTouricoHotels() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HotelDao hotelDao = context.getBean(HotelDao.class);

		List<VwOlimpusHotel> hotelList = hotelDao.findAllHotels();

		String json = "";
		
		responseSerhs = new ResponseSerhs();
		responseSerhs.setHotels(hotelList);
		
		Gson gson = new Gson();
		
		json = gson.toJson(hotelList);
		context.close();

		return json;
	}
	@RequestMapping(value="/serhs/olimpus/destinations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getTouricoDestinations (){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		DestinationsDao destinationsDao = context.getBean(DestinationsDao.class);
		List<VwOlimpusDestination> destinationsList = destinationsDao.findAllDestinations();
		
		String json = "";
		
		responseSerhs = new ResponseSerhs();
		responseSerhs.setDestinations(destinationsList);
		
		Gson gson = new Gson();

		json = gson.toJson(destinationsList);
		context.close();
		return json;
	}

}
