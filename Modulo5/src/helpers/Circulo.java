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
//subclase herencia
public class Circulo extends Formas {
    //propiedades
   private String radio="para calcular en radio de un circulo divide el perimetro entre 6.2832";
    //constructor
    public Circulo(){
        
    }
    //metodo  
    public String CalcularRadio(){
        return radio;
        }
    
}
