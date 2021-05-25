package pe.edu.upeu.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.apirest.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
