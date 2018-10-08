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
	public boolean save(PreparedStatement st){
        try {
            st.execute();
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
 
    }
	public Connection getConnect() {
		return this.connect;
	}
	
	
	//busca asientos entre 2 fechas
	public void mostrarAsientosPor(Date fechaInicio, Date fechaFin) {
		ResultSet result = null;
		try {
            PreparedStatement st = connect.prepareStatement("select * from asientos natural join transacciones where date between ? and ?");
            st.setDate(1,fechaInicio);
            st.setDate(2, fechaFin);
            result = st.executeQuery();
            while (result.next()) {
                //to do mostrar o mandar al return...
            	
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
	}
	
	//busco las cuentas para mostrar info
	public ResultSet buscarCuentasPor(String nombre) {
		ResultSet result = null;
		try {
			String sql = "select * from cuentas where cuenta.nombre like ?";
			PreparedStatement stmt = connect.prepareStatement(sql);
			stmt.setString(1, nombre);
			result = stmt.executeQuery();
			
		}catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return result;
	}
	
	//busca cuentas por id
	public ResultSet buscarCuentasPor(int codigo) {
		ResultSet result = null;
		try {
			String sql = "select from cuentas where cuenta.idCuenta = ?";
			PreparedStatement st = connect.prepareStatement(sql);
			st.setInt(1, codigo);
		}catch (SQLException ex) {
			System.err.println(ex.getMessage());

		}
		return result;
	}
}
