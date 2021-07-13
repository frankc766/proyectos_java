/*
 Cree una clase abstracta llamada Equipo, que contenga los siguientes métodos 
abstractos: getEquipo, getCapitan

2. Declare 3 clases con diferentes paises extendiendo de la clase Equipo, 
por ejemplo: RealMadrid, Barcelona, Liverpool, etc. 

En la clase que contiene el método principal (main), imprimir el nombre de los equipos 
y su presidente.
 */
package modulo4abstraccion;

import helpers.AtleticoMadrid;
import helpers.Juventus;
import helpers.ManchesterCity;

/**
 *
 * @author jun frncico
 */
public class Modulo4Abstraccion {

    public static void main(String[] args) {
        ManchesterCity MC = new ManchesterCity ();
        AtleticoMadrid AM = new AtleticoMadrid ();
        Juventus Ju = new Juventus ();
        
        System.out.println("---------------------------------------------------");
        System.out.println(MC.getequipo());
        System.out.println(MC.getcapitan());
        System.out.println("---------------------------------------------------");
        System.out.println(AM.getequipo());
        System.out.println(AM.getcapitan());
        System.out.println("---------------------------------------------------");
        System.out.println(Ju.getequipo());
        System.out.println(Ju.getcapitan());
    }
    
}
