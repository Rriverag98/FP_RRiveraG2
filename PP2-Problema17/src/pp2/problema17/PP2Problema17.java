/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema17;
import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int a,b,c; 
        a=pedirnumero("A");
        b=pedirnumero("B");
        c=calcular(a,b);
        resultado(c);
         }
    public static int pedirnumero(String x){
    int n;
    System.out.println("Introduce el numero " + x +" : ");
    Scanner teclado = new Scanner(System.in);
    n=teclado.nextInt();
    return  n;
    }
    public static int calcular(int a,int b){    
    int n = a,c;
        if (b<n){
            n=b;
            for (int i=1;i<=n;i++){
                if (a%i==0&&b%i==0){
                    c = i;
                } 
            } 
        } return n;
    }
public static void resultado (int c){
    System.out.println("El máximo comun divisor es: "+c);
}  
}
