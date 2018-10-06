package modelo;

public class CuentaSimple extends Cuenta {
	
	private float monto;
	
	@Override
	public float getMonto() {
		return this.monto;
	}

	public void setMonto(float m) {
		this.monto = m;

	}

}
