/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;


public class Futbolista {
  private String Nombre;
  private int Edad;
  private String EquipoActual;
  
  public void setNombbre(String nombre) {
      this.Nombre=nombre;
  }
  public String getNombre() {
      return Nombre;
  } 
  public void setEdad(int edad){
      this.Edad=edad;
  }
 public int getEdad(){
     return Edad;
 }
 public void setEquipoActual(String equipoActual){
     this.EquipoActual=equipoActual;
 }
 public String getEquipoActual(){
     return EquipoActual;
 }
  
}
