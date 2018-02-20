package com.dawes.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.clientes.InsertarClientesAccion;
import com.dawes.clientes.MostrarClientesAccion;

public abstract class Accion {
	
	//metodo abstracto ejecutar
	//le paso lo que recupera del servlet, peticion y respuesta.
	public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);
	
	//clase -->seleccion por el cliente.
	public static Accion getAccion(String tipo){
		
		if(tipo.equals("mostrarClientes")){
			return new MostrarClientesAccion();
		}
		if(tipo.equals("insertarClientes")){
			return new InsertarClientesAccion();
		}
		
		return null;
	}
	
	
}
