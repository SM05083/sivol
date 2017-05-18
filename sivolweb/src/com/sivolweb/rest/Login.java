package com.sivolweb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * RESTful que realiza Login
 * @author DS-EEHH
 *
 */
@Path("/login")
public class Login {
	
	@GET
	@Path("/{user}/{pass}")
	@Produces(MediaType.TEXT_PLAIN)
    public String loginService(	@PathParam("user") String user, 
    		@PathParam("pass") String pass){
         boolean success = true;
        
        
        return "Sesion Iniciada";
    }
	
	
}
