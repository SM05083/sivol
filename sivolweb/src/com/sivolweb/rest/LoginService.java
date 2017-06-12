package com.sivolweb.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.sivolweb.dao.implementation.LoginDAOImpl;
import com.sivolweb.dao.interfaces.LoginDao;
import com.sivolweb.model.SivolUsuario;

/**
 * RESTful que realiza Login
 * 
 * @author DS-EEHH
 *
 */
@Path("/login")
public class LoginService {

	
	private LoginDao loginDao = new LoginDAOImpl();
	
	@Context
	private HttpServletRequest request;

	@GET
	@Path("/{user}/{pass}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response loginService(@PathParam("user") String user, @PathParam("pass") String pass) {
		boolean success = true;
		
		JSONObject jsonObject = null;
		HttpSession session = request.getSession();
		try {
			jsonObject = new JSONObject();
			
			System.out.println("user: " + user );
			SivolUsuario sivolUsuario = loginDao.loginUser(user);			
			if(sivolUsuario != null){
				System.out.println("sivol user: " + sivolUsuario.getUsuUsuario());	
				success = validatePass(pass, sivolUsuario.getUsuContrasena());
				
				if(success){
					//--- * Usuario y password correcto * ---					
					session.setAttribute("usuario", user); //--- usuario						
					jsonObject.put("usuario", user);	
				} else{
					//--- * Se equivoco en el password * ---
					success = false;
					jsonObject.put("errMjs", "Usuario o Contraseña Incorrecta..");	
				}
			} else{
				success = false;
				jsonObject.put("errMjs", "Usuario o Contraseña Incorrecta..");	
			}
			//--- * Variable de acceso * ---
			jsonObject.put("estadoLogin", success);	
			session.setAttribute("estadoLogin", success);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		System.out.println("json : " + jsonObject.toString() + ".");
		return Response.status(200).entity(jsonObject.toString()).build();

	}

	/**
	 * Valida el password sha256Hex
	 * @param pass
	 * @return
	 */
	private boolean validatePass(String pass, String passSql) {
		String sha256Pass = DigestUtils.sha256Hex(pass);
		System.out.println("pass: " + sha256Pass);
		if(sha256Pass.trim().equals(passSql.trim())){
			return true;
		}
		return false;
	}

	@GET
	@Path("load")
	@Produces(MediaType.APPLICATION_JSON)
	public Response loadUser() {
		System.out.println("Cargando informacion de usuario");
		JSONObject jsonObject = null;
		HttpSession session = request.getSession();
		String usuario = "";
		try {
			jsonObject = new JSONObject();

			usuario = session.getAttribute("usuario").toString();
			
			jsonObject.put("usuario", usuario);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return Response.status(200).entity(jsonObject.toString()).build();
	}

}
