package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CuentaSimple extends Cuenta {
	
	private float monto;
	private int codigoCS;
	
	@Override
	public float getMonto() {
		return this.monto;
	}

	public void setMonto(float m) {
		this.monto = m;

	}
	
	public void save() throws SQLException{
		ConexionDB con = new ConexionDB();
        con.connect();
        String sql = "insert into cuentasCompuestas (nombre, tipo, monto, codigoCS) values (?,?,?,?)";
        PreparedStatement st = con.getConnect().prepareStatement(sql);
        st.setString(1, super.getNombre());
        st.setString(2, super.getTipo());
        st.setFloat(3, this.monto);
        st.setInt(4, this.codigoCS);
        con.save(st);
        con.close();
	}


}
