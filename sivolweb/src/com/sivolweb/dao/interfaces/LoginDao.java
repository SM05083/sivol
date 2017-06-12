package com.sivolweb.dao.interfaces;

import com.sivolweb.dao.DAO;
import com.sivolweb.model.SivolUsuario;

public interface LoginDao extends DAO {
	
	SivolUsuario loginUser(String user);
}
