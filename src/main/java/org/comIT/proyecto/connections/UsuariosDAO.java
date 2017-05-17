package org.comIT.proyecto.connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comIT.proyecto.entities.Usuario;



public class UsuariosDAO { 
	// conexion con sql 
	public void save(Usuario usuario) throws SQLException {
		Connection con = JDBCConnection.connectToDatabase();
// crea un objeto para enviar instrucciones y las envia a sql
		Statement st = con.createStatement();

		String queryToExecute = "insert into usuarios (nombre, email, clave) "
				+ "values ("
				+ "'"+usuario.getNombre()+"',"
				+ usuario.getEmail() + ","
				+ usuario.getClave() + ","
				+")";
		System.out.println(queryToExecute);
	   ResultSet buscar = st.executeQuery("select count(*) from usuarios where email = '+usuarios.getEmail()+' ");
	   	if (buscar.next()){
	   		int unEmail = buscar.getInt(1);
	   		if(unEmail == 0){
	   			int res =  st.executeUpdate(queryToExecute);   
	   		System.out.println("puede registrarte");
	   		}
	   		
	   	}
	   	//consulta la bd e inserta las instrucciones
		JDBCConnection.closeConnectionToDatabase(con);
	}


public Usuario getUsuario(int idUsuario) throws SQLException {
	Connection con = JDBCConnection.connectToDatabase();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from usuarios where id = " + idUsuario);
	return null;
	
	}

}