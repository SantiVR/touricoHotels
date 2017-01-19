package com.touricoHotels.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HotelView")
public class Hotel {

	@Id
	@Column(name="th_hotel_id")
	private String th_hotel_id;

	private String hotel_id;

	private String hotel_name;

	private String dest_code;

	private String country_code;

	private String city_name;

	private int latitude;

	private int longitude;

	private String addr;

	private String th_dest;

	private String status;

	public Hotel() {
	}

	public Hotel(String th_hotel_id, String hotel_id, String hotel_name, String dest_code, String country_code,
			String city_name, int latitude, int longitude, String addr, String th_dest, String status) {
		this.th_hotel_id = th_hotel_id;
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.dest_code = dest_code;
		this.country_code = country_code;
		this.city_name = city_name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addr = addr;
		this.th_dest = th_dest;
		this.status  = status;
	}

	public String getTh_hotel_id() {
		return th_hotel_id;
	}

	public void setTh_hotel_id(String th_hotel_id) {
		this.th_hotel_id = th_hotel_id;
	}

	public String getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(String hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getDest_code() {
		return dest_code;
	}

	public void setDest_code(String dest_code) {
		this.dest_code = dest_code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTh_dest() {
		return th_dest;
	}

	public void setTh_dest(String th_dest) {
		this.th_dest = th_dest;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Hotel [th_hotel_id=" + th_hotel_id + ", hotel_id=" + hotel_id + ", hotel_name=" + hotel_name
				+ ", dest_code=" + dest_code + ", country_code=" + country_code + ", city_name=" + city_name
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", addr=" + addr + ", th_dest=" + th_dest
				+ ", status=" + status + "]";
	}
	
	

}
