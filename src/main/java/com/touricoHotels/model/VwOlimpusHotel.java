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
	private BigDecimal cityName;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="DEST_CODE")
	private String destCode;

	@Column(name="HOTEL_ID")
	private String hotelId;

	@Column(name="HOTEL_NAME")
	private String hotelName;

	@Column(name="ID_SUPPLIER")
	private BigDecimal idSupplier;

	private BigDecimal lat;

	private String long_;

	private String status;
	
	@Id
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

	public BigDecimal getCityName() {
		return this.cityName;
	}

	public void setCityName(BigDecimal cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public BigDecimal getIdSupplier() {
		return this.idSupplier;
	}

	public void setIdSupplier(BigDecimal idSupplier) {
		this.idSupplier = idSupplier;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public String getLong_() {
		return this.long_;
	}

	public void setLong_(String long_) {
		this.long_ = long_;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThHotelId() {
		return this.thHotelId;
	}

	public void setThHotelId(String thHotelId) {
		this.thHotelId = thHotelId;
	}

}