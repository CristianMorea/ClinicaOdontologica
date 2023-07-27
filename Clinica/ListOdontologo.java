package Clinica;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOdontologo {
	
	private Odontologo instanciaodontologo = new Odontologo();
    private ArrayList<Odontologo> listaOdontologo = new ArrayList<>();
   
    
    public ArrayList<Odontologo> getListaOdontologo() {
		return listaOdontologo;
	}

	public void setListaOdontologo(ArrayList<Odontologo> listaOdontologo) {
		this.listaOdontologo = listaOdontologo;
	}


	public Odontologo ingresarDatosOdontologo(Scanner scanner) 
	{
	    System.out.println("INGRESE LOS DATOS DEL ODONTOLOGO");
	    System.out.println("NOMBRE");
	    String nombre = scanner.nextLine();
	    while (nombre.trim().isEmpty()) {
	        System.out.println("El nombre no puede estar vacío. Por favor, ingrese un nombre válido.");
	        nombre = scanner.nextLine();
	    }
	    System.out.println("APELLIDO");
	    String apellido = scanner.nextLine();
	    System.out.println("CEDULA");
	    String cedula = scanner.nextLine();
	    System.out.println("ESPECIALIDAD");
	    String especialidad = scanner.nextLine();
	   
	    
	    System.out.println("TELEFONO");
	    String telefono = scanner.nextLine();
	    while (telefono.length() != 10) 
	    {
	        System.out.println("El número de teléfono debe tener 10 dígitos. Por favor, ingrese un número de teléfono válido.");
	        telefono = scanner.nextLine();
	    }
	    
	    System.out.println("CORREO");
	    String correo = scanner.nextLine();
	    while (!instanciaodontologo.validarCorreo(correo)) {
	        System.out.println("El correo ingresado no es válido. Por favor, ingrese un correo válido.");
	        correo = scanner.nextLine();
	    }

	    return new Odontologo(nombre, apellido, cedula, especialidad, telefono, correo);
	}


	public void agregarOdontologo(Odontologo odontologo)
	{
	    if (odontologo != null) 
	    {
	        if (!listaOdontologo.contains(odontologo)) 
	        {
	            listaOdontologo.add(odontologo);
	        } else 
	        {
	            System.out.println("El odontólogo ya se encuentra en la lista.");
	        }
	    } else 
	    {
	        System.out.println("No se encontró el odontólogo a agregar.");
	    }
	}
	public void mostrarListaOdontologos(ArrayList<Odontologo> listaOdontologos) {
	    for (int i = 0; i < listaOdontologos.size(); i++) {
	        Odontologo odontologo = listaOdontologos.get(i);
	        System.out.println("Odontólogo número " + (i + 1));
	        System.out.println("Nombre: " + odontologo.getNombre());
	        System.out.println("Apellido: " + odontologo.getApellido());
	        System.out.println("Cédula: " + odontologo.getCedula());
	        System.out.println("Correo: " + odontologo.getCorreo());
	        System.out.println("Especialidad: " + odontologo.getSpecilidad());
	        System.out.println("Teléfono: " + odontologo.getTelefono());
	        System.out.println();
	    }
	}

    public void eliminarOdontologo(Odontologo odontologo) {
        if (listaOdontologo.contains(odontologo)) {
            listaOdontologo.remove(odontologo);
        } else {
            System.out.println("El odontólogo a eliminar no se encuentra en la lista.");
        }
    }


    public Odontologo modificarDatosOdontologo(Odontologo odontologo, Scanner scanner) {
        Odontologo odontologoEncontrado = buscarOdontologoPorNombre(odontologo.getNombre());

        if (odontologoEncontrado == null) {
           System.out.println("No se encontró un odontólogo con el nombre ingresado.");
          return null;
        }

       
        Odontologo odontologoModificado = ingresarDatosOdontologo(scanner);

        // Modificar los atributos del odontólogo encontrado con los nuevos datos
        odontologoEncontrado.setNombre(odontologoModificado.getNombre());
        odontologoEncontrado.setApellido(odontologoModificado.getApellido());
        odontologoEncontrado.setSpecilidad(odontologoModificado.getSpecilidad());
        odontologoEncontrado.setTelefono(odontologoModificado.getTelefono());
        odontologoEncontrado.setCorreo(odontologoModificado.getCorreo());

        return odontologoEncontrado;
    }

    public Odontologo buscarOdontologoPorNombre(String nombreOdontologo) 
    {
        for (Odontologo o : listaOdontologo) {
            if (o.getNombre().equalsIgnoreCase(nombreOdontologo)) {
                return o;
            }
        }

        return null;
    }
}