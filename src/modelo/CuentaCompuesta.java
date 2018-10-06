package modelo;

import java.util.ArrayList;
import java.util.List;

public class CuentaCompuesta extends Cuenta {
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	private float monto;
	
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

}
