/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fib;
        fib=pedirnumeros();
        Muestranumeros(fib);
    }
    public static int pedirnumeros(){
    int n;
    System.out.print("Ingresa la cantidad de numeros a mostrar: " ); 
    Scanner teclado = new Scanner(System.in);
    n=teclado.nextInt();
    while (n<=3){
    System.out.print("La cantidad debe ser mayor o igual a 3 " );
    System.out.print("Ingresa la cantidad de numeros a mostrar: " ); 
    n=teclado.nextInt();
    }
    return n;
    }
    public static void Muestranumeros(int fib){
          int f1=1,f2=1; // se empieza en el numero 3 por lo tanto los primeros 2 valores se imprimen siempre
        System.out.println("Los primeros "+fib+" numeros de la serie de Fibonacci son: ");
        System.out.print("0 "+f1+" ");
        for(int i=2;i<fib;i++){ //Se incrementa i hasta que fib se menor o igual a i
            System.out.print(f2+" ");
            f2 = f1 + f2; //el valor de F2 cambia cada ves se hace el proceso
            f1 = f2 - f1; //el valor de F1 cambia cada ves se hace el proceso
        }
    }
    }

