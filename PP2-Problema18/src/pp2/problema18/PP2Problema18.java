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
        if(n<b)n=b; //se busca el menor de los 3 numeros
        if(n<c)n=c;
        for (int i=2;i<n;i++){
            int p=0;
            if (a%i==0||b%i==0||c%i==0){//busca un numero que divida a los 3 si dejar remainders
                if (a%i==0){
                    int p1=0;
                    do {a=a/i;p1++;}
                    while(a%i==0);
                    p=p1;}//aumenta p hasta que el numero termine el loop y guarda el valor de i
                if (b%i==0){
                    int p2=0;
                    do {b=b/i;p2++;}
                    while(b%i==0);
                    if(p2>p)p=p2;} //aumenta p2 hasta que el numero termine el loop y en caso de ser mayor a p se guarda el valor de p2 en lugar de p1
                if (c%i==0){
                    int p3=0;
                    do {c=c/i;p3++;}
                    while(c%i==0);
                    if(p3>p)p=p3;}//aumenta p3 hasta que el numero termine el loop y en caso de ser mayor a p se guarda el valor de p3 en lugar de p2
                r=(int) (r*(Math.pow(i, p)));//guarda el producto de los divisores
            }
        }
        return r;
   }
    public static void resultado(int d){
        System.out.println("El minimo comun multiplo es: " + d);
    }
}
