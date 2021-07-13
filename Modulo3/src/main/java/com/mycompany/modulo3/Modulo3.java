/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulo3;

/**
 *
 * @author jun frncico
 */
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando el objeto persona 
    Estudiante estudiante = new Estudiante();
    estudiante.setNombre("francisco cruz");
    estudiante.setCarrera("Ing. Produccion Industrial");
    estudiante.setEdad (35);
    estudiante.setSexo ("M");
    estudiante.setPromedio(94.31);
    estudiante.setCampus("La Ceiba");
    
System.out.println("Nombre: " + estudiante.getNombre() );
System.out.println("Edad: " + estudiante.getEdad() );
System.out.println("Sexo: " + estudiante.getSexo() );
System.out.println("Carrera: " + estudiante.getCarrera() );
System.out.println("Campus: " + estudiante.getCampus() );
System.out.println("promedio: " + estudiante.getPromedio()+"%" );
    }
    
}
