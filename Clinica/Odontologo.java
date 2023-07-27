package Clinica;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Odontologo 
{
	  private String nombre;
	  private String apellido;
	  private String cedula;
    	private String especilidad;
	  private String telefono;
	  private String correo;
	
	  public Odontologo(String nombre, String apellido, String cedula, String specilidad, String telefono,
			String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.especilidad = specilidad;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getSpecilidad() {
		return especilidad;
	}

	public void setSpecilidad(String specilidad) {
		this.especilidad = specilidad;
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

	@Override
	public String toString() {
		return "Odontologo [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", specilidad="
				+ especilidad + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cedula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Odontologo other = (Odontologo) obj;
		return Objects.equals(cedula, other.cedula);
	}

	public Odontologo(String nombre, String cedula, String specilidad) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.especilidad = specilidad;
		
	}
	
	public Odontologo() {
		// TODO Auto-generated constructor stub
	}

	public boolean validarCorreo(String correo) 
	{
	    String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(correo);
	    return matcher.matches();
	}
	
	
	
}
