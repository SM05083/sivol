package com.sivolweb.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sivolweb.dao.implementation.UsuarioDAOImpl;
import com.sivolweb.dao.interfaces.UsuarioDAO;
import com.sivolweb.model.SivolUsuario;

/**
 * Restful para modulo de gestion de usuarios.
 * 
 * @author DS-EEHH
 *
 */
@Path("/usuarios")
public class GestionUsuarioService {

	private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
	
	@Context
	private HttpServletRequest request;
	
	@GET
	@Path("/load")
	@Produces(MediaType.APPLICATION_JSON)
	public Response loginService() {
		JSONObject jsonObject = null;
		System.out.println("Cargando lista de usuarios . . .");
		try{
			jsonObject = new JSONObject();
			List<SivolUsuario> usuarios = usuarioDAO.listaUsuario();
			JSONArray jsonArray = new JSONArray();
			for(SivolUsuario u: usuarios){
				System.out.println(u.toString());
				jsonArray.put(new JSONObject(u.toString()));
			}
			jsonObject.put("listaUsuarios", jsonArray);
		} catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println(jsonObject.toString());
		return Response.ok().entity(jsonObject.toString()).build();
	}


}
