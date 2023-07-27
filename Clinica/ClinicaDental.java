package Clinica;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.Scanner;

public class ClinicaDental {
	
	    ArrayList<CitaMedica>listadoCitas = new ArrayList<>();
	   
		ArrayList<TrabajoLaboratorio>listadoLaboratorio = new ArrayList<>();	   
		LinkedList<Gasto>listadoGastos = new LinkedList<>();
		 static HashMap<String, Pasiente> listadoPasiente = new HashMap<>();
	   static Scanner scanner = new Scanner(System.in);
	   
		
		public static void main(String[] args) 
		{
			 Scanner scanner = new Scanner(System.in);
			    ListOdontologo instanciaListOdontologo = new ListOdontologo();

			    // Ingresar los datos del odontólogo
			    Odontologo odontologo = instanciaListOdontologo.ingresarDatosOdontologo(scanner);

			    // Agregar el odontólogo a la lista
			    instanciaListOdontologo.agregarOdontologo(odontologo);
			    
			    instanciaListOdontologo.mostrarListaOdontologos(instanciaListOdontologo.getListaOdontologo());
			    
			    // Buscar y mostrar información de un odontólogo por nombre
			    System.out.println("Ingrese el nombre del odontólogo a buscar:");
			    String nombreBuscar = scanner.nextLine();
			    Odontologo odontologoEncontrado = instanciaListOdontologo.buscarOdontologoPorNombre(nombreBuscar);
			    if (odontologoEncontrado != null) {
			        System.out.println("Odontólogo encontrado:");
			        System.out.println(odontologoEncontrado.toString());
			    }

			    // Modificar los datos del odontólogo
			    instanciaListOdontologo.modificarDatosOdontologo(odontologo, scanner);

			    scanner.close();
	
		}
	
	
	


	
	
	
	
	/*
	 * public void registrarCitaMedica(Pasiente pasiente, Odontologo odontologo) 
	 * {
	    // Crear la cita médica y almacenarla en la lista
	    CitaMedica citaMedica = new CitaMedica( pasiente, odontologo,scanner);
	    listadoCitas.add(citaMedica);
	}
	 */
	
	

}
