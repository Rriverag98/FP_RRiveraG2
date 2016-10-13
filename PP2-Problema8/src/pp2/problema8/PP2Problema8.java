/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema8;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int A,B;
    double resultado,hipotenusa;
    A=catetos("A");
    B=catetos("B");
    resultado=calcular1(A,B);
    hipotenusa=calcular2(resultado);
    mostrarresultado(hipotenusa);
    }
    public static int catetos(String d) {
    int medida;
    System.out.print("Ingresa el dato " + d +" : " ); //pedir catetos
    Scanner teclado = new Scanner(System.in);
    medida=teclado.nextInt();
    return medida;
    }  
    public static double calcular1(int dato1,int dato2){
    return (Math.pow(dato1,2)+Math.pow(dato2,2));    
    }
    public static double calcular2(double calcular1){
    return (Math.sqrt(calcular1));
    }
    public static void mostrarresultado(double hipotenusa){
    System.out.println("La hipotenusa del triangulo es: "+hipotenusa);
    }
    }