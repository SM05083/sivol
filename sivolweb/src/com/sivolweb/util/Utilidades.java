package com.sivolweb.util;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Utilidades {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	private static final Map<Integer, String> estadoMap;
	    static {
	        Map<Integer, String> aMap = new HashMap();
	        aMap.put(1, "ACTIVO");
	        aMap.put(2, "INACTIVO");
	        aMap.put(3, "BLOQUEADO");
	        estadoMap = Collections.unmodifiableMap(aMap);
	    }
	
	/**
	 * Formatea la fecha a la plantilla por default dia mes año
	 * @param date
	 * @return
	 */
	public static String formatearFecha(Date date){
		return sdf.format(date);
	}
	
	/**
	 * Obtiene estado generico
	 * @param estado
	 * @return
	 */
	public static String obtenerEstado(int estado){
		return estadoMap.get(estado);
	}
	
}
