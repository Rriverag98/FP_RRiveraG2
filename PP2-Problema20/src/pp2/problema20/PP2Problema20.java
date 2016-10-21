/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema20;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b;
    a=pedirnumero("A");
    b=pedirnumero("B");
    resultado(a,b);
    }
    public static int pedirnumero(String g){
    int n;
        System.out.println("Introduce el numero: "+g);
    Scanner entrada = new Scanner(System.in);
    n=entrada.nextInt();
    return n;
    }
    public static void resultado(int a, int b){
     int r=1;
        for(int i=2;i<a;i++){
            if(a%i==0){
                r=r+i;
            }
        }
        if(r==b){
            System.out.println("El numero "+a+" es amigo de "+b+".");
        } else {
            System.out.println("El numero "+a+" no es amigo de "+b+".");
        }
    }
}

