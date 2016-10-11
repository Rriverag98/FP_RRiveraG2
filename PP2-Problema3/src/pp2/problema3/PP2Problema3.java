/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema3;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
    int numero;
    double resultado;
    numero=digitos();
    resultado=calcular(numero);
    mostrarresultado(numero,resultado);
    }
    public static int digitos(){
    int dato;
    System.out.println("Introduce el numero: ");
    Scanner teclado=new Scanner(System.in);
    dato = teclado.nextInt();
    return dato;    
    }
    public static double calcular(int digitos){
    double a=1;
    while(digitos>0){//Multiplica "a" por el numero hasta que sea 1
    a = (a*digitos);    
    digitos--;//Disminuye el numero por 1
    System.out.println(a);
    }
    return (a);
    }
    public static void mostrarresultado(int digitos,double resultado){
    System.out.println("El factorial de "+digitos+" es: "+resultado);
    }
}

