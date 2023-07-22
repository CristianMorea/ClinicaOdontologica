package Clinica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClinicaDental {
	
	    ArrayList<CitaMedica>listadoCitas = new ArrayList<>();
		ArrayList<TrabajoLaboratorio>listadoLaboratorio = new ArrayList<>();	
	    
		LinkedList<Gasto>listadoGastos = new LinkedList<>();
		static HashMap<String, Pasiente> listadoPasiente = new HashMap<>();
		static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		    agregarPasiente(listadoPasiente);
		    System.out.println(listadoPasiente.toString());
		
		
		
		
		
		 scanner.close();
		

	}
	
	public static Pasiente obtenerDatosPasiente()
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
	
	public static void agregarPasiente(HashMap<String, Pasiente> listadoPasiente) 
	{	      
        try 
        {
            Pasiente pasiente = obtenerDatosPasiente();
    	    listadoPasiente.put(pasiente.getCedula(), pasiente);
		} catch (NumberFormatException e) 
        {
			 System.out.println("Error: Ingrese un valor numérico válido para teléfono o cédula.");
		      
		}
        
	}

	
	public void registrarCita(CitaMedica cita) 
	{
		
		
	}
	
	

}
