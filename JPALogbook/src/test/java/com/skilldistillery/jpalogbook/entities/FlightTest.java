package com.skilldistillery.jpalogbook.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlightTest {
	
	
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Flight flight;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPALogbook");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		flight = em.find(Flight.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		flight = null;
	}

	@Test
	void test_Flight_mapping() {
		assertNotNull(flight);
		assertEquals("N2625C", flight.getAircraftId() );
	}

}
