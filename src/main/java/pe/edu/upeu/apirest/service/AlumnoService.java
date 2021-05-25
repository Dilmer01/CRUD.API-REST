package pe.edu.upeu.apirest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.apirest.entity.Alumno;
import pe.edu.upeu.apirest.repository.AlumnoRepository;

@Service
public class AlumnoService {
	@Autowired
	private AlumnoRepository repository;
	
	public List<Alumno> readll(){
		List<Alumno> alum = new ArrayList<>();
		repository.findAll().forEach(alum::add);
		return alum;
	}
	public Alumno create(Alumno alum) {
		return repository.save(alum);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	public Alumno read(Long id) {
		return repository.findById(id).get();
	}
	public Alumno update(Alumno a) {
		return repository.save(a);
	}

}
