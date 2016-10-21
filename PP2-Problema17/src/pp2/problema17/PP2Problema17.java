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
    int n = a,c = 0;
        if (b<n) //se busca el menor de los 2 numeros
            n=b;
            for (int i=1;i<=n;i++){ //se buscan los numeros que pueden dividir a los 2 numeros sin dejar remainders 
                if (a%i==0&&b%i==0){ //pasa cuando el resultado de los 2 numeros mod i es 0
                    c = i; //guarda el ultimo valor de i antes de detenerse el for
                } 
            } return c;
        } 
public static void resultado (int c){
    System.out.println("El máximo comun divisor es: "+c);
}  
}
