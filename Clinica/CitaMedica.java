package Clinica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class CitaMedica
{
 private Date fecha;
 private LocalTime hora;
 
 Pasiente pasiente =new Pasiente(null, null, null, null, null);
 Odontologo odontologo = new Odontologo(null, null, null);


 public CitaMedica(Pasiente pasiente, Odontologo odontologo, Scanner scanner)
 {
     this.fecha = obtenerFechaActual(scanner);
     this.hora = obtenerHoraActual(scanner);
 	this.pasiente = pasiente;
 	this.odontologo = odontologo;
 }


public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public LocalTime getHora() {
	return hora;
}

public void setHora(LocalTime hora) {
	this.hora = hora;
}

public Pasiente getPasiente() {
	return pasiente;
}

public void setPasiente(Pasiente pasiente) {
	this.pasiente = pasiente;
}

public Odontologo getOdontologo() {
	return odontologo;
}

public void setOdontologo(Odontologo odontologo) {
	this.odontologo = odontologo;
}
 
 public Date obtenerFechaActual(Scanner scanner)
 {
	 LocalDate fechaActual = LocalDate.now();
	 DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 String fechaActualString = fechaActual.format(formatoFecha);
	 System.out.println("Fecha actual: " + fechaActualString);
	   System.out.println("INGRECE LOS DATOS DE LA CITA MEDICA");
	    System.out.println("FECHA (si desea la fecha actual, presione Enter): ");
	    String fecha = scanner.nextLine();
	    if (fecha.isEmpty()) {
	        fecha = fechaActualString;
	    }
		return getFecha();
 }
 public LocalTime obtenerHoraActual(Scanner scanner)
 {
	    LocalTime horaActual = LocalTime.now();
	    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String horaActualString = horaActual.format(formatoHora);
	    System.out.println("Hora actual: " + horaActualString);
	    System.out.println("HORA (si desea la hora actual, presione Enter): ");
	    String hora = scanner.nextLine();
	    if (hora.isEmpty()) {
	        hora = horaActualString;
	    }
		return getHora();

 }


 
 
 
 
 
 
 
}
