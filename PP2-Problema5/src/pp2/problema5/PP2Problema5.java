/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema5;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero;
    numero = digito();
    resultado(primo(numero),numero);
    }
   public static boolean primo(int numero){
    if (numero%2==0) return false;
    for(int i=3;i*i<=numero;i+=2) {
    if(numero%i==0)
    return false;
    }
    return true;
    }
    public static int digito(){
    System.out.println("Introduce el numero: ");
    int Dato;
    Scanner teclado = new Scanner(System.in);
    Dato = teclado.nextInt();
    return Dato;    
    }
    public static void resultado(boolean primo, int numero){
    if (primo==true){
    System.out.println("El numero "+numero+" es primo");    
    }else{
        System.out.println("El numero "+numero+" no es primo");
    }
    }
    }
