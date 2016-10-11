/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema4;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){  
    int medida;
    double resultado1;
    medida=metros();
    resultado1=calcular1(medida);
    mostrarresultado(medida,resultado1);
    }
    public static int metros(){
    int dato;
    System.out.println("Introduce la medida en metros: ");
    Scanner teclado=new Scanner(System.in);
    dato = teclado.nextInt();
    return dato;    
    }
    public static double calcular1(int medida){//convertir celsius a fahrenheit
    return ((medida*1.8)+32);    
    }
    public static void mostrarresultado(int digitos,double resultado){
    System.out.println(digitos+"'C  son: "+resultado+"'F ");
    }
    
}
