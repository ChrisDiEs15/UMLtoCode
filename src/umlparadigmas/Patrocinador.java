/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlparadigmas;

/**
 *
 * @author cdiaz
 */
public class Patrocinador {
public String nombreMarca;
private String representante;

    public Patrocinador(String nombreMarca, String representante) {
        this.nombreMarca = nombreMarca;
        this.representante = representante;
    }
//GETTERS
    public String getNombreMarca() {
        return nombreMarca;
    }

    public String getRepresentante() {
        return representante;
    }
//SETTERS

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    

}
