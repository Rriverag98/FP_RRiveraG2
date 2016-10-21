/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema18;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,d; 
        a=pedirnumero("A");
        b=pedirnumero("B");
        c=pedirnumero("D");
        d=calcular(a,b,c);
        resultado(d);
         }
    public static int pedirnumero(String x){
    int n;
    System.out.println("Introduce el numero " + x +" : ");
    Scanner teclado = new Scanner(System.in);
    n=teclado.nextInt();
    return  n;
    }
   public static int calcular(int a, int b,int c){
        int r=1,n;
        n=a;
        if(n<b)n=b;
        if(n<c)n=c;
        for (int i=2;i<n;i++){
            if (a%i==0||b%i==0||c%i==0){
                r=r*i;
                if (a%i==0) a=a/i;
                if (b%i==0) b=b/i;
                if (c%i==0) c=c/i;
            }
        }
        return r;
   }
    public static void resultado(int d){
        System.out.println("El minimo comun multiplo es: " + d);
    }
}
