/*
Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones 
daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)
 */
package modulo1;


public class modulo1tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int M=6, T=1, K=-10;
    boolean desicion1=true;
    boolean desicion2=false;
        System.out.println("dado los numeros M = 6, T = 1, K = -10");
       System.out.println("primera interrogante M > T true or false? ");
       if (M > T){ 
           System.out.println("*******"+desicion1+"********");
       }
       if (M < T){
           System.out.println("*******"+desicion2+"********");
           }
        System.out.println("segunda interrogante T / K == -5  true or false? ");
       if (T / K == -5){ 
           System.out.println("*******"+desicion1+"********");
       }
       if (T / K != -5){ 
           System.out.println("*******"+desicion2+"********");
       }
        System.out.println("tercera interrogante (M+T == 7) || (M-T == 5) true or false? ");
       if ((M+T == 7) || (M-T == 5)){ 
           System.out.println("*******"+desicion1+"********");
       }
       if ((M+T != 7) || (M-T != 5)){ 
           System.out.println("*******"+desicion2+"********");
       }
       

    }
}
