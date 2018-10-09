package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaccion {
	private boolean esDebe;
	private Cuenta cuenta;
	private float monto;
	private Asiento asiento;
	
	
	public boolean isEsDebe() {
		return esDebe;
	}
	public void setEsDebe(boolean esDebe) {
		this.esDebe = esDebe;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public void setAsiento (Asiento a) {
		this.asiento = a;
	}
	public Asiento getAsiento() {
		return this.asiento;
	}
	
	
	//para guardar en la db
	public void save(int id) throws SQLException{
		ConexionDB con = new ConexionDB();
        con.connect();
        PreparedStatement st = con.getConnect().prepareStatement("insert into transacciones (esDebe, cuenta, monto, idAsiento) values (?,?,?,?)");
        st.setInt(1, cuenta.getNumero());
        st.setFloat(2, this.monto);
        st.setBoolean(3, this.esDebe);
        st.setInt(4, id);
        con.save(st);
        con.close();
    }
}
