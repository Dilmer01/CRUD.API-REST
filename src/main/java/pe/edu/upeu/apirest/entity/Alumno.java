package pe.edu.upeu.apirest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idalumno;
	private String nombre;
	private String correo;
	private String telefono;
	public Alumno() { }
	public Alumno(long idalumno, String nombre, String correo, String telefono) {
		super();
		this.idalumno = idalumno;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}
	public long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(long idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
				+ "]";
	}
	
	
	

}
