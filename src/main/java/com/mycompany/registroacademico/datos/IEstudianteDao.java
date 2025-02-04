
package com.mycompany.registroacademico.datos;

import com.mycompany.registroacademico.dominio.Estudiante;
import java.util.List;


public interface IEstudianteDao {
    
    public List<Estudiante> buscarTodosEstudiante();
    public Estudiante buscarEstudiantePorId(Estudiante estudiante);
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante);
    public void insertEstudiante(Estudiante estudiante);
    public void modificarEstudiante (Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);    
}
