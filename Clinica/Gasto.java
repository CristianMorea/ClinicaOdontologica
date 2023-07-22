package Clinica;

public class Gasto 
{

	private String descripcion;
	private double monto;
	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Gasto(String descripcion, double monto) {
		this.descripcion = descripcion;
		this.monto = monto;
	}
	
	
	
	
}
