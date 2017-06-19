package com.sivolweb.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.sivolweb.dao.JpaDAO;
import com.sivolweb.dao.interfaces.UsuarioDAO;
import com.sivolweb.model.SivolUsuario;

/**
 * Consultas relacionadas al modulo de gestion de usuarios
 * @author DS-EEHH
 *
 */
public class UsuarioDAOImpl extends JpaDAO implements UsuarioDAO {

	/**
	 * Obtiene lista de todos los usuarios registrados en el sistema
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SivolUsuario> listaUsuario(){
		List<SivolUsuario> items = null;
		try{
			String strQuery="SivolUsuario.findAll";			
			Query q = entityManager.createNamedQuery(strQuery);
			items = q.getResultList();
			return items;
		} catch(NoResultException ex){
			items = new ArrayList<SivolUsuario>();
		}
		
		return items;
	}
}
