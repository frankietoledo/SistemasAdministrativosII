package modelo;



public abstract class Cuenta {
	private int numero;
	private String nombre;
	private String descripcion;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public abstract float getMonto();//dependera de si la cuenta resive o no saldo como lo calcula
	

	
}
