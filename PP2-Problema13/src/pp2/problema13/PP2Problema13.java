/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        int [] n = new int [30];
        n=pedirnumeros(n);
        r=promedio(n);
        narribadep(n,r);
    }
    public static int [] pedirnumeros(int [] n){
 Scanner teclado = new Scanner(System.in);
 for (int i=0;i<n.length;i++){
 System.out.print("Ingresa el numero en la pocision: " + (i+1) + " " ); 
    n[i]=teclado.nextInt();
    } return  n;
    }
    public static int promedio(int[] n){
        int a=0,p=0;
        for (int i=1; i<n.length; i++){
            a=n[i]+a;
            p++;
            
        }
         System.out.println("El promedio de los numeros introducidos es: "+ a/p);
         int c=a/p;
         return c;
         }
    public static void narribadep(int [] n, int r){
        int d=0, e=0;
        for (int i=0;i<n.length;i++){
        if (n[i]>r){
        d++;}
        if (n[i]<r){
        e++;}
        }System.out.println("La cantidad de numeros arriba del promedio es: " +d);
            System.out.println("La cantidad de numeros abajo del promedio es: "+e);
    }
    }
  
 
    

