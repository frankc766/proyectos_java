/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author jun frncico
 */
//superclase
public class Formas {
    //propiedades de la clase
    private String color;
    //constructor
    public Formas(){
    
    }
    //metodos
   public void setcolor(String color){
       this.color=color;
   } 
    public String dibujar(String nombre){  
        return nombre;
    }
}
