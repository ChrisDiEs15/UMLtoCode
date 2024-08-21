/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlparadigmas;
import java.util.ArrayList;

/**
 *
 * @author cdiaz
 */
public class Futbolista extends SeleccionFutbol implements Deportista{
 public String nombre;
 public int numPlayera;
 ArrayList<Patrocinador> listaPatrocinador = new ArrayList<>();
 
 public Futbolista(int id, String nomSeleccion, String nombre, int numPlayera){
     super(id, nomSeleccion);
     this.nombre=nombre;
     this.numPlayera=numPlayera;
 }
//interface
    @Override
    public void entrenar(String Velocidad) {
        throw new UnsupportedOperationException("Sin soporte aun"); 
    }

    @Override
    public void entrenar(String velocidad, String fuerza) {
        throw new UnsupportedOperationException("Sin soporte aun"); 
    }
//getters
    public String getNombre() {
        return nombre;
    }

    public int getNumPlayera() {
        return numPlayera;
    }

    public ArrayList<Patrocinador> getListaPatrocinador() {
        return listaPatrocinador;
    }

 //setters   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPlayera(int numPlayera) {
        this.numPlayera = numPlayera;
    }

    public void setListaPatrocinador(ArrayList<Patrocinador> listaPatrocinador) {
        this.listaPatrocinador = listaPatrocinador;
    }
    
    public void AgregarPatrocinador(Patrocinador patrocinador){
    listaPatrocinador.add(patrocinador);
        
    }
}
