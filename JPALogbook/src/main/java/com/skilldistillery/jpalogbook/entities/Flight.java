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
	@Column(name = "aircraft_id")
	private String aircraftId;
	@Column(name = "flight_date")
	private Date flightDate;

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

	@Override
	public String toString() {
		return "Flight [id=" + id + ", aircraftId=" + aircraftId + ", flightDate=" + flightDate + "]";
	}

}
