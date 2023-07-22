package Clinica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClinicaDental {
	
	    ArrayList<CitaMedica>listadoCitas = new ArrayList<>();
	    ArrayList<Odontologo>listaOdontologo = new ArrayList<>();
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

	public static Odontologo obtenerDatosOdontologo()
	{
		System.out.println("INGRESE LOS DATOS DEL ODONTOLOGO");
		System.out.println("NOMBRE");
		String nombre = scanner.nextLine();
		System.out.println("APELLIDO");
		String apellido = scanner.nextLine();
		System.out.println("ESPECIALIDAD");
		String cedula = scanner.nextLine();
		System.out.println("ESPECIALIDAD");
		String especialidad = scanner.nextLine();
		System.out.println("TELEFONO");
		String telefono = scanner.nextLine();
		System.out.println("CORREO");
		String correo = scanner.nextLine();

		return new Odontologo(nombre, apellido, cedula, especialidad, telefono, correo);
		
	}
	
	public static void agregarOdontologo(ArrayList<Odontologo> listaOdontologo, Odontologo odontologo)
	{
		listaOdontologo.add(odontologo);
	}
	
	
	
	
	
	public void registrarCitaMedica(Pasiente pasiente, Odontologo odontologo) 
	{
	   
	   
	    
	    
	    // Formatear la hora y la fecha como cadenas en el formato deseado
	    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String horaActualString = horaActual.format(formatoHora);
	    
	    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String fechaActualString = fechaActual.format(formatoFecha);
	    
	    System.out.println("Fecha actual: " + fechaActualString);
	    System.out.println("Hora actual: " + horaActualString);
	    
	    System.out.println("INGRECE LOS DATOS DE LA CITA MEDICA");
	    System.out.println("FECHA (si desea la fecha actual, presione Enter): ");
	    String fecha = scanner.nextLine();
	    if (fecha.isEmpty()) {
	        fecha = fechaActualString;
	    }
	    System.out.println("HORA (si desea la hora actual, presione Enter): ");
	    String hora = scanner.nextLine();
	    if (hora.isEmpty()) {
	        hora = horaActualString;
	    }
	    
	    // Crear la cita médica y almacenarla en la lista
	    CitaMedica citaMedica = new CitaMedica(fecha, hora, pasiente, odontologo);
	    listadoCitas.add(citaMedica);
	}
	
	
	
	
	
	
	
}
