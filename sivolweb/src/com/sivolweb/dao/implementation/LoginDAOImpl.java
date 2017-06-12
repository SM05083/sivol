package com.sivolweb.dao.implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sivolweb.dao.JpaDAO;
import com.sivolweb.dao.interfaces.LoginDao;
import com.sivolweb.model.SivolUsuario;

/**
 * Implemenatcion DAO para todo lo relacionado a la gestion de usuarios
 * @author DS-EEHH
 *
 */
public class LoginDAOImpl extends JpaDAO implements LoginDao {
	
	@Override
	public SivolUsuario loginUser(String user) {
		Query q = entityManager.createQuery(
				"SELECT u FROM SivolUsuario u where u.usuUsuario = :user ");
		q.setParameter("user", user);
		return (SivolUsuario) q.getSingleResult();
	}

}
