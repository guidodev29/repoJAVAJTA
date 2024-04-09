
package com.mycompany.registroacademico.datos;

import com.mycompany.registroacademico.dominio.Estudiante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EstudianteDaoImp implements IEstudianteDao {
    @PersistenceContext(unitName = "EstudianteUP")
    EntityManager em;
    
    @Override
    public List<Estudiante> buscarTodosEstudiante() {
        return em.createNamedQuery("Estudiante.findAll").getResultList();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Estudiante estudiante) {
        return em.find(Estudiante.class, estudiante.getId());
    }

    @Override
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante) {
        Query q = em.createQuery("from Estudiante e where e.carnet=; carnet");
        q.setParameter("carnet", estudiante.getCarnet());
        return (Estudiante) q.getSingleResult();
    }

    @Override
    public void insertEstudiante(Estudiante estudiante) {
        em.persist(estudiante);
    }

    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        em.merge(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        em.remove(em.merge(estudiante));
    }
    
}
