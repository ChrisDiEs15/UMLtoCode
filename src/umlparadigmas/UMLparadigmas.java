/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package umlparadigmas;

import java.util.ArrayList;

/**
 *
 * @author cdiaz
 */
public class UMLparadigmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="Pablo";
        String nombreSeleccion="Camerun";
        int id= 16;
        int numPlayera=34;
        // detallesPAt1
        String nombreMarca1="adidas";
        String Representante1="Eustaquio";
        //detallesPat2
        String nombreMarca2="rebook";
        String Representante2="Alejandra";
        //detallesPat3
        String nombreMarca3="nike";
        String Representante3="Angelica";
        
        //agregar informacion de patrocinadores
        Patrocinador patrocinador1 = new Patrocinador(nombreMarca1, Representante1);
        Patrocinador patrocinador2 = new Patrocinador(nombreMarca2, Representante2);
        Patrocinador patrocinador3 = new Patrocinador(nombreMarca3, Representante3);  
        //Instanciar al futbolista
        Futbolista Pablo = new Futbolista(id, nombreSeleccion, nombre, numPlayera);
        //Agregar los patrocinadores
        Pablo.AgregarPatrocinador(patrocinador1);
        Pablo.AgregarPatrocinador(patrocinador2);
        Pablo.AgregarPatrocinador(patrocinador3);
    //Regresar valores de pablo
        System.out.println("" + Pablo.getId());
        System.out.println("" +Pablo.getNomSeleccion());
        System.out.println(""+ Pablo.getNombre());
        System.out.println(Pablo.getNumPlayera());
        
        //Regresa los Patrocinadores
        ArrayList<Patrocinador> actual = new ArrayList<>();
        actual = Pablo.getListaPatrocinador();
        
         for (Patrocinador patrocinador : actual) {
            System.out.println(patrocinador.getRepresentante());
            System.out.println(patrocinador.getNombreMarca());
        }
        
        
    }
}
