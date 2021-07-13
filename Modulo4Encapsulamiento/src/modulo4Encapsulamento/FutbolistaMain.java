/*
 1. Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y 
propiedades utilizando encapsulamiento, desde la clase que contiene el método principal, 
establecer y obtener su edad, nombre y equipoActual (Métodos set y get).

 */
package modulo4Encapsulamento;

import helpers.Futbolista;
import java.util.Scanner;
/**
 *
 * @author jun frncico
 */
public class FutbolistaMain {

    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
        String nombre2;
        String equipo2;
        int edad2;
        System.out.println("ingresa el nombre del futbolista");
       nombre2=entrada.nextLine();
       System.out.println("ingresa la edad del futbolista");
       edad2=entrada.nextInt();
       System.out.println("ingresa el equipo actual del futbolista");
       entrada.nextLine();
       equipo2 =entrada.nextLine();
     
               //se envio la informacion ala clase privada metodo set

      Futbolista fut = new Futbolista();
      fut.setNombbre(nombre2);
      fut.setEdad(edad2);
      fut.setEquipoActual(equipo2);
      
        //ahora obtenemos los datos metodo get
        
        System.out.println("  ");
        System.out.println("el nombre del futbolista es:  "+fut.getNombre());
        System.out.println("su edad es:  "+fut.getEdad());
        System.out.println("su equipo actual es:  "+fut.getEquipoActual());
    }
    
}
