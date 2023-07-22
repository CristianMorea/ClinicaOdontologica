package Clinica;

import java.time.LocalTime;
import java.util.Date;

public class CitaMedica
{
 private Date fecha;
 private LocalTime hora;
 
 Pasiente pasiente =new Pasiente(null, null, null, null, null);
 Odontologo odontologo = new Odontologo(null, null, null, null, null);

 public CitaMedica(Date fecha, LocalTime hora, Pasiente pasiente, Odontologo odontologo) 
 {
	this.fecha = fecha;
	this.hora = hora;
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
 
 
 
 
 
 
 
 
 
}
