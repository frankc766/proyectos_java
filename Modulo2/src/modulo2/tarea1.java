
/*
 Crear una clase que se llame Recursos con 4 métodos diferentes.
•	Instanciar la clase en el programa principal y llamar a los métodos con diferentes operaciones:
 
Los métodos debe retornar los siguientes tipos de valor, colocar nombres descriptivos para cada uno de ellos: 
Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos 2021".
Segundo método: Declarar una variable de tipo entero y asignarle un número X que represente la edad del estudiante. Retornar un mensaje dependiendo de esa variable si es mayor o igual a 21, el mensaje debe decir Mayor de edad, de lo contrario Menor de edad.
Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como parámetros.
Cuarto método:  Debe retornar una lista de numeros del 1 al X. Donde X es un parámetro de entrada del método a crear.

 */
package modulo2;

public class tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursos recursos = new Recursos(); //Instancia de la clase Recursos
recursos.saludo();                  //Llamar los métodos en esa clase por medio de objeto recursos,primer metodo
recursos.edad(35);               //Llamar el segundo método
recursos.multiplicacion(5,4);     //Llamar el tercer método
recursos.lista_Num(35);           //Llamar el cuarto método
    }
   
    public static class Recursos {

  //Método que no recibe parámetro de entrada ni retorna valor(metodo 1)
  public void saludo() {
    System.out.println("Programación Orientada a Objetos 2021");
}
    
  //Método que  recibe parámetro entero para imprimir un valor (metodo 2)
public void edad(int edad) {
    System.out.print("tienes:"+edad+" años");
  if (edad > 18){
     System.out.println(" ***Eres mayor de edad***");
  }else{
     System.out.println("  ***Eres menor de edad***");
     }
    }
//Método que  recibe parámetros enteros desarroll un proceso para imprimir un valor (metodo 3)
public void multiplicacion(int num1,int num2){
    int multi;
    multi=num1*num2;
    System.out.println("el resultado de "+num1+" por "+num2+" es = "+multi);
            
}
//Método que  recibe parámetro entero para imprimir una lista (metodo 4)
public void lista_Num(int x){
    System.out.println("lista de numeros del 1 al "+x);
    for(int y=1;y<=x;y++){
       System.out.println("-"+y);
    }
}
   
    }
    
}
