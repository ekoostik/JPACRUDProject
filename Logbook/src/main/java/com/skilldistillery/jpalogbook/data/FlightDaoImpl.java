package com.skilldistillery.jpalogbook.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpalogbook.entities.Flight;
@Service
@Transactional
public class FlightDaoImpl implements FlightDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Flight findById(int id) {
		
		return em.find(Flight.class, id);
	}

	@Override
	public List<Flight> findAll() {
		String jpql = "SELECT f from Flight f";
		
		return em.createQuery(jpql, Flight.class).getResultList();
	}

	@Override
	public Flight create(Flight flt) {
		// TODO Auto-generated method stub
		Flight newflight = new Flight();
		
		
		newflight.setFlightDate(flt.getFlightDate());
		newflight.setAircraftId(flt.getAircraftId());
		newflight.setAircraftType(flt.getAircraftType());
		newflight.setLandingCount(flt.getLandingCount());
		newflight.setFlightConditions(flt.getFlightConditions());
		newflight.setRemarks(flt.getRemarks());
		
		
		em.persist(newflight);
		
		return newflight;
	}

	
	// no begin/commit 
	// no em.close
	@Override
	public Flight update(int id, Flight flt) {
		// TODO Auto-generated method stub
	 Flight updated = em.find(Flight.class, id);
		updated.setAircraftId(flt.getAircraftId());
		updated.setFlightDate(flt.getFlightDate());
		updated.setAircraftType(flt.getAircraftType());
		updated.setLandingCount(flt.getLandingCount());
		updated.setFlightConditions(flt.getFlightConditions());
		updated.setRemarks(flt.getRemarks());
		
		return updated;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		boolean didDelete = false;
		Flight flt = em.find(Flight.class, id);
		if(em.contains(flt)) {
			em.remove(flt);
			didDelete = true;
		}
		return didDelete;
	}

}
