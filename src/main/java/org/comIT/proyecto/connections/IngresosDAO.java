package org.comIT.proyecto.connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comIT.proyecto.entities.Ingreso;



public class IngresosDAO {

		// conexion con sql 
		public void save(Ingreso ingreso) throws SQLException {
			Connection con = JDBCConnection.connectToDatabase();
	// crea un objeto para enviar instrucciones y las envia a sql
			Statement st = con.createStatement();

			String queryToExecute = "insert into ingresos (fecha, monto, detalles, categoria) "
					+ "values ("
					+ "'"+ingreso.getFecha()+"',"
					+ ingreso.getMonto() + ","
					+ ingreso.getDetalles() + ","
					+ ingreso.getCategoria() +","
					+")";
			System.out.println(queryToExecute);
			//consulta la bd e inserta las instrucciones
			int res =  st.executeUpdate(queryToExecute);
			System.out.println(res);
			JDBCConnection.closeConnectionToDatabase(con);

	}
	
	public Ingreso getIngreso(int idIngreso) throws SQLException {
		Connection con = JDBCConnection.connectToDatabase();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from usuarios where id = " + idIngreso);
			
		Ingreso ingreso = null;
		if(rs.next()){
			int cFecha = rs.getInt(2);
			System.out.println("la fecha es "+ cFecha);
			float cMonto = rs.getFloat(3);
			System.out.println("el monto es " + cMonto);
			String cDetalles = rs.getString(4);
			System.out.println("el detalle es " + cDetalles);
			String cCategoria=rs.getString(5);
			System.out.println("la categoria es " + cCategoria);
		}
		JDBCConnection.closeConnectionToDatabase(con);	
        return ingreso;	
   }
}





