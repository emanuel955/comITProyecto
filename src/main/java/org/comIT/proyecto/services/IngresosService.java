package org.comIT.proyecto.services;

import java.sql.SQLException;

import org.comIT.proyecto.connections.IngresosDAO;
import org.comIT.proyecto.entities.Ingreso;


public class IngresosService {
	private final IngresosDAO dao = new IngresosDAO();

	public Ingreso getIngreso(int idIngreso) throws SQLException {	
		Ingreso ingreso;
		ingreso = dao.getIngreso(idIngreso);
		return ingreso;
	}
	
	public void saveIngreso(Ingreso ingreso) throws SQLException {
		dao.save(ingreso);
	}

}
