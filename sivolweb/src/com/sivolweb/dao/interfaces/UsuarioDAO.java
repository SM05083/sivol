package com.sivolweb.dao.interfaces;

import java.util.List;

import com.sivolweb.dao.DAO;
import com.sivolweb.model.SivolUsuario;

public interface UsuarioDAO extends DAO {

	List<SivolUsuario> listaUsuario();

}
