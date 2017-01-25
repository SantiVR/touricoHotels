package com.touricoHotels.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VW_OLIMPUS_HOTELS database table.
 * 
 */
@Entity
@Table(name="VW_OLIMPUS_HOTELS")
@NamedQuery(name="VwOlimpusHotel.findAll", query="SELECT v FROM VwOlimpusHotel v")
public class VwOlimpusHotel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String addr;

	@Column(name="CITY_NAME")
	private String cityName;

	@Column(name="DEST_CODE")
	private String destCode;
	
	@Id
	@Column(name="HOTEL_ID")
	private String hotelId;

	@Column(name="HOTEL_NAME")
	private String hotelName;

	private BigDecimal lat;

	private BigDecimal long_;

	private String status;

	@Column(name="TH_DEST")
	private String thDest;
	
	@Column(name="TH_HOTEL_ID")
	private String thHotelId;

	public VwOlimpusHotel() {
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDestCode() {
		return this.destCode;
	}

	public void setDestCode(String destCode) {
		this.destCode = destCode;
	}

	public String getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLong_() {
		return this.long_;
	}

	public void setLong_(BigDecimal long_) {
		this.long_ = long_;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThDest() {
		return this.thDest;
	}

	public void setThDest(String thDest) {
		this.thDest = thDest;
	}

	public String getThHotelId() {
		return this.thHotelId;
	}

	public void setThHotelId(String thHotelId) {
		this.thHotelId = thHotelId;
	}

}