package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;


public class Asiento {
	private int codigo;
	private String fecha;
	private List<Transaccion> transacciones;
	
	public Asiento(int cod, String fecha1){
            transacciones = new ArrayList<Transaccion>();
            codigo = cod;
            this.fecha = fecha1;
        }
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	public void addTransaccion (Transaccion t) {
		this.transacciones.add(t);
	}
	
	public void removeTransaccion(Transaccion t) {
		this.transacciones.remove(t);
	}
	
	public void save() throws SQLException{
        
		
            ConexionDB con = new ConexionDB();
            con.connect();
            PreparedStatement st = con.getConnect().prepareStatement("insert into asientos (fecha) values (?)");
            st.setString(1, this.getFecha());
            con.save(st);
            //guardar el idAsiento que recien guarde
            String sql = "SELECT last_insert_rowid()";
            PreparedStatement stId = con.getConnect().prepareStatement(sql);
            int idAsiento = stId.executeQuery().getInt(1);
            //en teoria deberia tener el idAsiento del asiento recien guadado
            con.close();
            for (Transaccion t:this.transacciones) {
                    t.save(idAsiento);
            }
            con.close();
    }
	

}
