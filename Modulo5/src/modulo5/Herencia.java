/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author jun frncico
 */
public class Herencia {

    public static void main(String[] args) {
        //instancia de clases
        Circulo cir=new Circulo();
        Linea lin=new Linea();
        Triangulo tri=new Triangulo();
        Cuadrado cua=new Cuadrado();
        
        //imprimir salida de informacion de las clases por medio de metodos propios y heredados
        System.out.println("****************************************************************");
        
        System.out.println("forma numero 1");
        System.out.println(cir.dibujar("El Circulo"));
        System.out.println(cir.CalcularRadio());
        
          System.out.println("****************************************************************");
        
        System.out.println("forma numero 2");
        System.out.println(lin.dibujar("La linea"));
        System.out.println(lin.largo);
        
          System.out.println("****************************************************************");
          
        System.out.println("forma numero 3");
        System.out.println(tri.dibujar("El Triangulo"));
        System.out.println(tri.calcularArea());
        
          System.out.println("****************************************************************");
          
        System.out.println("forma numero 4");
        System.out.println(cua.dibujar("El Cuadrado"));
        System.out.println(cua.calcularArea());
        
    }
    
}
