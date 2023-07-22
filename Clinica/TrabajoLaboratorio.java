package Clinica;

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
	
	
}
