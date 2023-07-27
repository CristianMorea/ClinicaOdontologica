package Clinica;

import java.util.Scanner;

public class TrabajoLaboratorio 
{
	 private String tipo;
	  private double costo;
	  private boolean estado;
	
	  public TrabajoLaboratorio(String tipo, double costo, boolean estado) {
		this.tipo = tipo;
		this.costo = costo;
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public TrabajoLaboratorio crearTrabajoLaboratorio(Scanner scanner)
	{
		
	 System.out.println("INGRESE EL TIPO DE TRABAJO A REALIZAR EN EL LABORATORIO");
	 String tipo = scanner.nextLine();
	 System.out.println("INGRESE EL COSTO DEL TRABAJO");
	 double costo = scanner.nextDouble();
	return null;
	 
		
		
		
		
	}
	
}
