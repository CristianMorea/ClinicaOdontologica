package Clinica;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Pasiente 
{
  private String nombre;
  private String apellido;
  private String telefono;
  private String cedula;
  private String direccion;
  
  
  @Override
public String toString() {
	return "Pasiente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", cedula=" + cedula
			+ ", direccion=" + direccion + "]";
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
	Pasiente other = (Pasiente) obj;
	return Objects.equals(cedula, other.cedula);
}

  
  public Pasiente(String nombre, String apellido, String telefono, String cedula, String direccion)
  {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.cedula = cedula;
		this.direccion = direccion;
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
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public void buscarPasienteCedula (HashMap<String, Pasiente > listadoPasiente, Scanner scanner)
{
	System.out.println("INGRESE LA CEDULA DEL PACIENTE");
	String cedulaPaciente = scanner.nextLine();
	Pasiente pasiente = listadoPasiente.get(cedulaPaciente);
	 if(pasiente==null)
	 {
		 System.out.println("NO SE ENCONTRO UN PASIENTE CON ESA CEDULA");
		 return;
	 }
	
}


public static Pasiente obtenerDatosPasiente(Scanner scanner)
{
	    System.out.println("INGRESE EL NOMBRE DEL PACIENTE");
	    String nombre = scanner.nextLine();
	    System.out.println("INGRESE EL APELLIDO DEL PACIENTE");
	    String apellido = scanner.nextLine();
	    System.out.println("INGRESE EL TELEFONO DEL PACIENTE");
	    String telefono = scanner.nextLine();
	    System.out.println("INGRESE EL CEDULA DEL PACIENTE");
	    String cedula = scanner.nextLine();
	    System.out.println("INGRESE LA DIRECCION DEL PACIENTE");
	    String direccion = scanner.nextLine();

	    return new Pasiente(nombre, apellido, telefono, cedula, direccion);
}

public static void agregarPasiente(HashMap<String, Pasiente> listadoPasiente, Scanner scanner) {
    try {
        Pasiente pasiente = Pasiente.obtenerDatosPasiente(scanner);
        listadoPasiente.put(pasiente.getCedula(), pasiente);
    } catch (NumberFormatException e) {
        System.out.println("Error: Ingrese un valor numérico válido para teléfono o cédula.");
    }
}








  
}
