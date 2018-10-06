package modelo;

public class Transaccion {
	private boolean esDebe;
	private Cuenta cuenta;
	private float monto;
	
	
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
}
