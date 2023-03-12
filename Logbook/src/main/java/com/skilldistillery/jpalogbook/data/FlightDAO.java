package com.skilldistillery.jpalogbook.data;

import java.util.List;

import com.skilldistillery.jpalogbook.entities.Flight;

public interface FlightDAO {
	
	public Flight findById(int id);
	public List<Flight> findAll();
	public Flight create(Flight flt); 
	public Flight update(int id, Flight flt);
	public boolean deleteById(int id);

}
