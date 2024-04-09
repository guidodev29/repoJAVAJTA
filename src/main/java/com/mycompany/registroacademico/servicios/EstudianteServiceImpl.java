
package com.mycompany.registroacademico.servicios;

import com.mycompany.registroacademico.datos.IEstudianteDao;
import com.mycompany.registroacademico.dominio.Estudiante;
import java.util.List;
import javax.inject.Inject;


public class EstudianteServiceImpl implements IEstudianteService {
    
    @Inject
    private IEstudianteDao iEstudiante;

    @Override
    public List<Estudiante> buscarTodosEstudiante() {
        return iEstudiante.buscarTodosEstudiante();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Estudiante estudiante) {
        return iEstudiante.buscarEstudiantePorId(estudiante);
    }

    @Override
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante) {
        return iEstudiante.buscarEstudiantePorCarnet(estudiante);
    }

    @Override
    public void insertEstudiante(Estudiante estudiante) {
        iEstudiante.insertEstudiante(estudiante);
    }

    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        iEstudiante.modificarEstudiante(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        iEstudiante.eliminarEstudiante(estudiante);
    }
    
}
