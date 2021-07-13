/*
 Crear un arrelo que guarde e imprima 20 nombres de ciudades
 */
package modulo1;
import java.util.Scanner;
public class modulo1tarea4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
    String[] city = new String[20];
        for(int x=0;x<20;x++){
       int y=(x+1);
        System.out.println("escriba en nombre de la ciudad ciudad "+y);
        city[x]=entrada.nextLine();
    }
      for(int x=0;x<20;x++){
       int y=(x+1);
        System.out.println("la ciudad "+y +"= "+city[x]);
        
    }  
    }
}
