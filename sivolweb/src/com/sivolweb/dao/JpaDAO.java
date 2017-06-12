package com.sivolweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public abstract class JpaDAO implements DAO {

	@PersistenceContext()
	protected EntityManager entityManager;
	
	public JpaDAO() {
		if(entityManager == null){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory( "sivolweb" );
			entityManager = factory.createEntityManager();
		}
		System.out.println("EntityManager: " + entityManager);
	}
	
}
