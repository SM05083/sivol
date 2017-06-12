package com.sivolweb.test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.commons.codec.digest.DigestUtils;

import com.sivolweb.model.SivolUsuario;

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
		Query q = em.createQuery("select u from SivolUsuario u ");
		List<SivolUsuario> todoList = q.getResultList();
		for (SivolUsuario todo : todoList) {
			System.out.println(todo.getUsuContrasena());
		}
		System.out.println("Size: " + todoList.size());

//		// create new todo
//		em.getTransaction().begin();
//		SivolUsuario todo = new SivolUsuario();
//		todo.setSummary("This is a test");
//		todo.setDescription("This is a test");
//		em.persist(todo);
//		em.getTransaction().commit();

//		em.close();
	}
}