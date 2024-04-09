
package com.mycompany.registroacademico.servicios;

import com.mycompany.registroacademico.dominio.Estudiante;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IEstudianteService {
    public List<Estudiante> buscarTodosEstudiante();
    public Estudiante buscarEstudiantePorId(Estudiante estudiante);
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante);
    public void insertEstudiante(Estudiante estudiante);
    public void modificarEstudiante (Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);  
}
