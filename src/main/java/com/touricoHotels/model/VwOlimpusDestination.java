package com.touricoHotels.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VW_OLIMPUS_DESTINATIONS database table.
 * 
 */
@Entity
@Table(name="VW_OLIMPUS_DESTINATIONS")
@NamedQuery(name="VwOlimpusDestination.findAll", query="SELECT v FROM VwOlimpusDestination v")
public class VwOlimpusDestination implements Serializable {
	private static final long serialVersionUID = 1L;

	private String city;

	private String code;

	@Column(name="COUNTRY_CODE")
	private String countryCode;
	
	@Id
	@Column(name="ID_")
	private BigDecimal id;

	private BigDecimal lat;

	private BigDecimal long_;

	@Column(name="STATE_")
	private String state;

	@Column(name="TH_CODE")
	private String thCode;

	public VwOlimpusDestination() {
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getThCode() {
		return this.thCode;
	}

	public void setThCode(String thCode) {
		this.thCode = thCode;
	}

}