package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;


public class Asiento {
	private int codigo;
	private Date fecha;
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
            st.setDate(1, this.getFecha());
            con.save(st);
            //guardar el idAsiento que recien guarde
            String sql = "SELECT last_insert_rowid()";
            PreparedStatement stId = con.getConnect().prepareStatement(sql);
            int idAsiento =  stId.executeQuery().getInt(1);
            //en teoria deberia tener el idAsiento del asiento recien guadado
            con.close();
            for (Transaccion t:this.transacciones) {
                    t.save(idAsiento);
            }
            con.close();
    }
	

}
