package com.skilldistillery.jpalogbook.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private int id;
	
	@Column(name = "flight_date")
	private Date flightDate;
	
	@Column(name = "aircraft_id")
	private String aircraftId;
	
	@Column(name ="aircraft_type")
	private String aircraftType;
	
	@Column(name ="landing_count")
	private int landingCount;
	
	@Column(name="flight_conditions")
	private String flightConditions;
	
	private String remarks;
	

	public Flight() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAircraftId() {
		return aircraftId;
	}

	public void setAircraftId(String aircraftId) {
		this.aircraftId = aircraftId;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getLandingCount() {
		return landingCount;
	}

	public void setLandingCount(int landingCount) {
		this.landingCount = landingCount;
	}

	public String getFlightConditions() {
		return flightConditions;
	}

	public void setFlightConditions(String flightConditions) {
		this.flightConditions = flightConditions;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightDate=" + flightDate + ", aircraftId=" + aircraftId + ", aircraftType="
				+ aircraftType + ", landingCount=" + landingCount + ", flightConditions=" + flightConditions
				+ ", remarks=" + remarks + "]";
	}


}