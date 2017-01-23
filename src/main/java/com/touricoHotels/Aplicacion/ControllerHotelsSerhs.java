package com.touricoHotels.Aplicacion;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.touricoHotels.dao.HotelDao;
import com.touricoHotels.model.RequestHotels;
import com.touricoHotels.model.ResponseSerhs;
import com.touricoHotels.model.VwOlimpusHotel;

import oracle.jdbc.pool.OracleDataSource;

@RestController
@RequestMapping("/downloadHotels")
public class ControllerHotelsSerhs {

	@Autowired
	private Environment env;

	private RestTemplate restTemplate;

	private ResponseSerhs responseSerhs;

	public ControllerHotelsSerhs() {
	}

	@Autowired
	public ControllerHotelsSerhs(Environment env) {
		// this.restTemplate = restTemplate;
		this.env = env;
	}

	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getTouricoHotels(@RequestBody RequestHotels hotels) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HotelDao hotelDao = context.getBean(HotelDao.class);

		List<VwOlimpusHotel> hotelList = hotelDao.findAllHotels();

		String json = "";
		try {
			json = serializedToXml(hotelList);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (VwOlimpusHotel hotel : hotelList) {
			System.out.println(hotel.toString());
		}

		context.close();

		return json;
	}

	private String serializedToXml(List<VwOlimpusHotel> hotelList) throws JsonProcessingException {
		responseSerhs = new ResponseSerhs();
		responseSerhs.setHotels(hotelList);
		
		Gson gson = new Gson();

		XmlMapper xmlMapper = new XmlMapper();
		//String xml = xmlMapper.writeValueAsString(responseSerhs);
		String json = gson.toJson(hotelList);
		return json;
	}
}
