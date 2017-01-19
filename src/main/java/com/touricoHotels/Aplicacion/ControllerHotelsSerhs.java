package com.touricoHotels.Aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.touricoHotels.dao.HotelDao;
import com.touricoHotels.model.Hotel;
import com.touricoHotels.model.RequestHotels;

import ch.qos.logback.core.Context;

@RestController
@RequestMapping("/downloadHotels")
public class ControllerHotelsSerhs {

	@Autowired
	private Environment env;

	private RestTemplate restTemplate;

	public ControllerHotelsSerhs() {
	}

	public ControllerHotelsSerhs(RestTemplate restTemplate, Environment env) {
		this.restTemplate = restTemplate;
		this.env = env;
	}
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody String getTouricoHotels(@RequestBody RequestHotels hotels){
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 
		HotelDao hotelDao = context.getBean(HotelDao.class);
		
		List<Hotel> hotelList= hotelDao.findAllHotels();
		
		for(Hotel hotel : hotelList){
			System.out.println(hotel.toString());
		}
		
		return null;
	}

}
