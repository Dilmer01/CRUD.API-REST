package pe.edu.upeu.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirest.entity.Alumno;
import pe.edu.upeu.apirest.service.AlumnoService;

@RestController
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoservice;
	
	@GetMapping("/")
	public String mensaje() {
		return "ALUMNO";
	}
	@GetMapping("/alum")
	public List<Alumno> getList(){
		return alumnoservice.readll();
	}
	@DeleteMapping("/alum/delete/{id}")
	public String delete(@PathVariable long id) {
		alumnoservice.delete(id);
		return "ALUMNO ELIMINADO CON ÉXITO";
	}
	@GetMapping("/alum/{id}")
	public Alumno read(@PathVariable Long id) {
		return alumnoservice.read(id);
	}
	@PutMapping("/alum/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Alumno alum) {
		System.out.println(id);
		Alumno a = alumnoservice.read(id);
		System.out.println(alum.getNombre());
		a.setIdalumno(alum.getIdalumno());
		a.setNombre(alum.getNombre());
		a.setTelefono(alum.getTelefono());
		a.setCorreo(alum.getCorreo());
		alumnoservice.update(a);
		return "ALUMNO MODIFICADO";
	}
}
