package com.skilldistillery.jpalogbook.data;

import java.util.List;

import com.skilldistillery.jpalogbook.entities.Flight;

public interface FlightDAO {
	
	Flight findById(int id);
	List<Flight> findAll();
	Flight create(Flight flt);
	Flight update(int id, Flight flt);
	boolean deleteById(int id);

}
