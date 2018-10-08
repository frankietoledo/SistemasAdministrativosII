package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaccion {
	private boolean esDebe;
	private Cuenta cuenta;
	private float monto;
	private Asiento idAsiento;
	
	
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
	
	//para guardar en la db
	public void save() throws SQLException{
		ConexionDB con = new ConexionDB();
        con.connect();
        PreparedStatement st = con.getConnect().prepareStatement("insert into transacciones (esDebe, cuenta, monto, idAsiento) values (?,?,?,?)");
        st.setBoolean(1, this.esDebe);
        st.setInt(2, cuenta.getNumero());
        st.setFloat(3, this.monto);
        con.save(st);
        con.close();
    }
}
