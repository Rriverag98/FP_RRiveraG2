/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema12 {
public static void main(String[] args) {
        int [] n = new int [10]; //pedir un numero 10 veces
        n=pedirnumeros(n);
        Muestranumeros(n);
    }
    public static int [] pedirnumeros(int [] n){
 Scanner teclado = new Scanner(System.in);
 for (int i=0;i<n.length;i++){ //Se pide un numero para cada pocision
 System.out.print("Ingresa el numero en la pocision: " + (i+1) + " " ); 
    n [i]=teclado.nextInt();
    } return  n;
    }
    public static void Muestranumeros(int[] n){
           int a=0,p=0;
        for (int i=1; i<n.length; i=i+1){
            a=n[i]+a; //se Suman los numeros
            p++;
        }
        System.out.println("La media de los numeros introducidos es: "+ a/p); //se muestra la media de los numeros
    }
}
 
    

