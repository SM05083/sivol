package com.sivolweb.dao.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sivolweb.dao.JpaDAO;
import com.sivolweb.dao.interfaces.LoginDao;
import com.sivolweb.model.SivolUsuario;
import com.sivolweb.model.pojos.MenuItem;

/**
 * Implemenatcion DAO para todo lo relacionado a la gestion de usuarios
 * @author DS-EEHH
 *
 */
public class LoginDAOImpl extends JpaDAO implements LoginDao {
	
	/**
	 * Obtener usuario
	 * @param user String
	 * @return SivolUsuario
	 */
	@Override
	public SivolUsuario loginUser(String user) {
		try{
			Query q = entityManager.createQuery(
					"SELECT u FROM SivolUsuario u where u.usuUsuario = :user ");
			q.setParameter("user", user);
			SivolUsuario userObj = (SivolUsuario) q.getSingleResult();
			return userObj;
		}catch(NoResultException ex){
			
		}
			return null;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MenuItem> loginMenuItem(String user){
		List<MenuItem> items = null;
		try{
			String strQuery="select menu.menite_codigo,menu.menite_nombre, menu.menite_descripcion,"
					+ " menu.menite_url from sivol_permiso per join sivol_menu_item menu on menu.menite_codigo=per.menite_codigo"
					+ " where per.per_estado='A' and per.pef_codigo=(select perfil.pef_codigo"
					+ " from sivol_usuario usr join sivol_tipo_usuario tusr on tusr.tipusu_codigo=usr.tipusu_codigo "
					+ " join sivol_perfil perfil on perfil.pef_codigo=tusr.pef_codigo where usr.usu_usuario = ?)";
			
			Query q = entityManager.createNativeQuery(strQuery, MenuItem.class).setParameter(1, user);
			items = q.getResultList();
			return items;
		} catch(NoResultException ex){
			items = new ArrayList<MenuItem>();
		}
		
		return items;
	}

}
