package modelo;

import java.sql.*;

public class ConexionDB {
	//private String url= "E:\\Mis Documentos y Mas\\Documents\\NetBeansProjects\\SistemasAdministrativosII\\sa2.db";
	//private String url= "/mnt/DATA/Sistemas Administrativos 2/sa2/SistemasAdministrativosII/sa2.db";
        private String url= "/home/frank/NetBeansProjects/SistemasAdministrativosII/sa2.db";
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
	
	//busca asiento por idAsiento
	public ResultSet transaccionesPorIdAsiento(String idAsiento) {
            ResultSet result = null;
            try {
                PreparedStatement st = connect.prepareStatement("select * from transacciones inner join cuentasSimples on transacciones.idCuenta=cuentasSimples.idCuenta where transacciones.idAsiento=?");//
                st.setString(1,idAsiento);
                result = st.executeQuery();

            } catch (SQLException ex) {
                System.err.println(ex.getMessage());

            }
            return result;    
	}
	
	//busca asientos entre 2 fechas
	public ResultSet mostrarAsientosPor(String fechaInicio, String fechaFin) {
            ResultSet result = null;
            try {
                PreparedStatement st = connect.prepareStatement("select * from asientos where asientos.fecha between ? and ?");//
                st.setString(1,fechaInicio);
                st.setString(2, fechaFin);
                result = st.executeQuery();

            } catch (SQLException ex) {
                System.err.println(ex.getMessage());

            }
            return result;    
	}
	
	//busco las cuentas para mostrar info
	public ResultSet buscarCuentasPor(String nombre) {
		ResultSet result = null;
		try {
			String sql = "select * from cuentasSimples where cuentasSimples.nombre like ?";
			PreparedStatement stmt = connect.prepareStatement(sql);
			stmt.setString(1,'%'+nombre+'%');
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
			String sql = "select * from cuentasSimples where cuentasSimples.codigoCS = ?";
			PreparedStatement st = connect.prepareStatement(sql);
			st.setInt(1, codigo);
                        result = st.executeQuery();
		}catch (SQLException ex) {
			System.err.println(ex.getMessage());

		}
		return result;
	}
        public ResultSet todasLasCuentas() {
		ResultSet result = null;
		try {
			String sql = "select * from cuentasSimples";
			PreparedStatement st = connect.prepareStatement(sql);
                        result = st.executeQuery();
		}catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return result;
	}
        public ResultSet generarMayor(int codigoCuenta){
            ResultSet result = null;
            try {
                String sql = "select * from cuentasSimples natural join (asientos natural join transacciones) where cuentasSimples.codigoCS = ?";
                PreparedStatement st = connect.prepareStatement(sql);
                st.setInt(1, codigoCuenta);
                result = st.executeQuery();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return result;
        }
}
