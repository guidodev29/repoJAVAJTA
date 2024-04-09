
package com.mycompany.registroacademico.web;

import com.mycompany.registroacademico.dominio.Estudiante;
import com.mycompany.registroacademico.servicios.IEstudianteService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/estudiante")
public class EstudianteServlet extends HttpServlet{
    @Inject
    IEstudianteService iEstService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        List<Estudiante> estudiantes = iEstService.buscarTodosEstudiante();
        System.out.println("Estudiantes: " + estudiantes);
        request.setAttribute("Estudiantes ",estudiantes);
        request.getRequestDispatcher("/listadoEstudiante.jsp").forward(request, response);
        
        
    }
    
}
