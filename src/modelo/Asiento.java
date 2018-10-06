package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	

}
