package com.sivolweb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AccessFilter
 */
@WebFilter("*")
public class AccessFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AccessFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filtrando Acceso");
		HttpServletRequest req = (HttpServletRequest) request;
        String requestURI = req.getRequestURI();
        try{
        	if("pages/index.html".contains(requestURI)){
        		chain.doFilter(request, response);
        	} else if ("pages/".contains(requestURI)) {
	        	HttpSession session = req.getSession();
	        	System.out.println("estadoLogin desde filtro: " + session.getAttribute("estadoLogin"));
	        	if(session.getAttribute("estadoLogin") != null){
	        		if(Boolean.getBoolean("" + session.getAttribute("estadoLogin")) == true){
	        			System.out.println("true");
	        			chain.doFilter(request, response);
	        		} else{
	        			System.out.println("false");
	        			request.getRequestDispatcher("pages/index.html").forward(request, response);
	        		}        		
	        	}else{
	        		session.setAttribute("estadoLogin", false);
	        		request.getRequestDispatcher("pages/index.html").forward(request, response);
	        	}
	        } else {
	            chain.doFilter(request, response);
	        }
        } catch(Exception ex){
        	chain.doFilter(request, response);
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
