package org.comIT.proyecto.controllers;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


import org.comIT.proyecto.entities.Ingreso;
import org.comIT.proyecto.services.IngresosService;

@Consumes(MediaType.APPLICATION_JSON)
@Path("formularios")
public class FormularioController {

	private final IngresosService service = new IngresosService();
	
    @POST
	@Produces("text/plain")
	public String creaticket(@QueryParam("fomulario") int numero, String letras  ) {
		
		Ingreso ingreso= new Ingreso(numero, numero, letras, letras);
		try {
			service.saveIngreso(ingreso);
		} catch (SQLException e) {
			e.printStackTrace();
			return "hubo un inconveniente guardando el ticket";
		} 
		
		return null;
	}
}



	