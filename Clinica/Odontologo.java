package Clinica;

public class Odontologo 
{
	  private String nombre;
	  private String apellido;
	  private String specilidad;
	  private String telefono;
	  private String correo;
	
	  public Odontologo(String nombre, String apellido, String specilidad, String telefono, String correo) 
	  {
		this.nombre = nombre;
		this.apellido = apellido;
		this.specilidad = specilidad;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSpecilidad() {
		return specilidad;
	}

	public void setSpecilidad(String specilidad) {
		this.specilidad = specilidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	  
	
}
