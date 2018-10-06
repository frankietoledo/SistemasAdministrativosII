package modelo;

import java.sql.*;

public class ConexionDB {
	private String url= "/home/flynn/Documents/sa2/SistemasAdministrativosII";
	public Connection connect;
	
	public void connect(){
		 try {
		     connect = DriverManager.getConnection("jdbc:sqlite:"+url);
		     if (connect!=null) {
		         System.out.println("Conectado");
		     }
		 }catch (SQLException ex) {
		     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
		 }
		}
		 public void close(){
		        try {
		            connect.close();
		        } catch (SQLException ex) {
		            
				     System.err.println("No se pudo cerrar la BD, algo exploto\n"+ex.getMessage());

		        	//Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex); la comnete xq no reconoce el Logger, debo tener q importar, pero parece ser de windows
		        }
		 }
}
