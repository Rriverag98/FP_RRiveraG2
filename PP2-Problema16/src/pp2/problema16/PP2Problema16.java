/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int n,a,b; 
        n=pedirnumero("A");
        a=pedirnumero("B");
        b=pedirnumero("C");
        resultado(n,a,b);
         }
    public static int pedirnumero(String x){
    int n;
    System.out.println("Introduce el numero " + x +" : ");
    Scanner teclado = new Scanner(System.in);
    n=teclado.nextInt();
    return  n;
    }
    public static void resultado(int n,int a,int b){
        if (b<n&&a<n){ // revisa si n es mas grande que b y c
            System.out.println("El numero mas grande es: "+n);
        }
         if (b<a&&n<a){ //revisa si a es mas grande que n y b
            System.out.println("El numero mas grande es: "+a);
        }
          if (n<b&&a<b){//revisa si b es mas grande que n y a
            System.out.println("El numero mas grande es: "+b);
        }
         }
}
    
   
