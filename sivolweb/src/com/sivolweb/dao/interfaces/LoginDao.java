package com.sivolweb.dao.interfaces;

import java.util.List;

import com.sivolweb.dao.DAO;
import com.sivolweb.model.SivolUsuario;
import com.sivolweb.model.pojos.MenuItem;

public interface LoginDao extends DAO {
	
	SivolUsuario loginUser(String user);

	List<MenuItem> loginMenuItem(String user);
	
}
