
package modulo1;
//Crear un programa que imprima en consola
//todas las operaciones aritméticas de 4 números enteros (suma, resta, multiplicación, divición)
public class modulo1tarea2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1=20,num2=10,num3=4,num4=2;
        double  sum, rest,mult,div;
        sum=num1+num2+num3+num4;
        rest=num1-num2-num3-num4;
        mult=num1*num2*num3*num4;
        div=num1/num2/num3/num4;
        System.out.println("primer numero: "+num1);
        System.out.println("segundo numero: "+num2);
        System.out.println("tercero numero: "+num3);
        System.out.println("cuarto numero: "+num4);
        System.out.println("*******desarrollo de operaciones********** ");
        System.out.println("la suma de todos los numeros es: "+sum);
        System.out.println("la resta de todos los numeros es: "+rest);
        System.out.println("la multiplicacion de todos los numeros es: "+mult);
        System.out.println("divicion de todos los numeros es: "+div);
        
                
    }
}
