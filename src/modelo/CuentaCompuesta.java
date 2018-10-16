package modelo;

import java.sql.PreparedStatement;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CuentaCompuesta extends Cuenta {
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	private float monto;
	private int codigoCC;
	
	
	@Override
	public float getMonto() {
		// recorre las cuentas q la componen y les pregunta el monto
		for (Cuenta c:cuentas) {
			this.monto += c.getMonto();
		}
		return this.monto;
	}
	
	public void addCuenta(Cuenta c) {
		this.cuentas.add(c);
	}
	public boolean removeCuenta (Cuenta c) {
		return this.cuentas.remove(c);
	}
	
	public void save() throws SQLException{
		ConexionDB con = new ConexionDB();
        con.connect();
        String sql = "insert into cuentasCompuestas (nombre, tipo, codigoCC) values (?,?,?)";
        PreparedStatement st = con.getConnect().prepareStatement(sql);
        st.setString(1, super.getNombre());
        st.setString(2, super.getTipo());
        st.setInt(3, this.codigoCC);
        con.save(st);
        con.close();
	}

}
