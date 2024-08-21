/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlparadigmas;

/**
 *
 * @author cdiaz
 */
public class SeleccionFutbol {
    protected int id;
    protected String nomSeleccion;
    
    public SeleccionFutbol(int id, String nomSeleccion){
    this.id=id;
    this.nomSeleccion=nomSeleccion;
    }
    
    //getters
    public int getId() {
        return id;
    }

    public String getNomSeleccion() {
        return nomSeleccion;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNomSeleccion(String nomSeleccion) {
        this.nomSeleccion = nomSeleccion;
    }
    
}
