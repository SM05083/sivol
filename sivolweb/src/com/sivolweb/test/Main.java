package com.sivolweb.test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.commons.codec.digest.DigestUtils;

import com.sivolweb.model.SivolMenuItem;
import com.sivolweb.model.SivolUsuario;
import com.sivolweb.model.pojos.MenuItem;

public class Main {
	private static final String PERSISTENCE_UNIT_NAME = "sivolweb";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		String originalString = "admin";
		String str = "admin";

		
		String sha256hex = DigestUtils.sha256Hex(originalString);
		System.out.println("sha256: " + sha256hex);
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		List<MenuItem> items = null;
		String user = "admin";
		try{
//			String strQuery = "select menu from SivolPermiso per "
//					+ " join SivolMenuItem menu on menu.meniteCodigo = per.meniteCodigo "
//					+ " where per.perEstado='A' and per.pefCodigo=(select perfil.pefCodigo "
//					+ " from SivolUsuario usr join SivolTipoUsuario tusr on tusr.tipusuCodigo = usr.tipusuCodigo "
//					+ " join SivolPerfil perfil on perfil.pefCodigo=tusr.pefCodigo where usr.usuUsuario = :user )";
			String strQuery="select menu.menite_codigo,menu.menite_nombre, menu.menite_descripcion,"
					+ " menu.menite_url from sivol_permiso per join sivol_menu_item menu on menu.menite_codigo=per.menite_codigo"
					+ " where per.per_estado='A' and per.pef_codigo=(select perfil.pef_codigo"
					+ " from sivol_usuario usr join sivol_tipo_usuario tusr on tusr.tipusu_codigo=usr.tipusu_codigo "
					+ " join sivol_perfil perfil on perfil.pef_codigo=tusr.pef_codigo where usr.usu_usuario = ?)";
			
			Query q = em.createNativeQuery(strQuery, MenuItem.class).setParameter(1, user);
					//Query(strQuery);
			items = q.getResultList();
			for(MenuItem m: items){
				System.out.println(m.getDescripcion());
			}
		} catch(NoResultException ex){
			ex.printStackTrace();
			items = new ArrayList<MenuItem>();
		}
	}
}