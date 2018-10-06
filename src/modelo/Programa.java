package modelo;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	private List<Cuenta> listaCuentas = new ArrayList<Cuenta>();
	private List<Asiento> listaAsientos = new ArrayList<Asiento>();
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	
	public List<Cuenta> getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(List<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	public List<Asiento> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(List<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	public void addCuenta(Cuenta c) {
		this.listaCuentas.add(c);
	}
	public void addUsuario(Usuario u) {
		this.listaUsuarios.add(u);
	}
	public void addAsiento (Asiento a) {
		this.listaAsientos.add(a);
	}
}
