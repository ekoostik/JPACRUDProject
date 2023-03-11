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
		return null;
	}

	
	// no begin/commit 
	// no em.close
	@Override
	public Flight update(int id, Flight flt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
