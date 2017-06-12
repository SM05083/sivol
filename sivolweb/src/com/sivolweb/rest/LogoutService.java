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

import org.json.JSONException;
import org.json.JSONObject;

/**
 * RESTful que finaliza sesion
 *
 */

@Path("/logout")
public class LogoutService {

	@Context
	private HttpServletRequest request;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Response logoutService(){
		System.out.println("LogoutService ... start");
		boolean success = true;
		JSONObject jsonObject = null;
	    HttpSession session = request.getSession();
	    try {
			jsonObject = new JSONObject();
			
			jsonObject.put("estadoLogout", success);
			
			session.invalidate();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    System.out.println("json : " + jsonObject.toString() + ".");
        return  Response.status(200).entity(jsonObject.toString() ).build();
	}
	
}
