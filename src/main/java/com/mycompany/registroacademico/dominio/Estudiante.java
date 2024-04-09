package com.mycompany.registroacademico.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@NamedQueries({
    @NamedQuery(name ="Estudiante.findAll", query = "SELECT e FROM Estudiante e ORDER BY e.carnet")
})
@Entity
public class Estudiante implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String carnet;
    private String nombres;
    private String apellidos;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public String getCarnet(){
        return carnet;
    }
    
    public void setCarnet(String carnet){
        this.carnet = carnet;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    
}
