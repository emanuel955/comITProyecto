package org.comIT.proyecto.services;

import java.sql.SQLException;

import org.comIT.proyecto.connections.UsuariosDAO;
import org.comIT.proyecto.entities.Usuario; 

public class ConexionUsuario {
	private final UsuariosDAO dao = new UsuariosDAO();

	public Usuario getUsuario(int idUsuario) throws SQLException {	
		Usuario usuario;
		usuario = dao.getUsuario(idUsuario);
		return usuario;
	}
	
	public void saveUsuario(Usuario usuario) throws SQLException {
		dao.save(usuario);
	}

}
