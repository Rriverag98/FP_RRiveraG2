/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema7;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema7 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    int medida;
    double resultado1;
    medida=metros();
    resultado1=calcular1(medida);
    mostrarresultado(medida,resultado1);
    }
    public static int metros(){
    int dato;
    System.out.println("Introduce los Km/h: ");
    Scanner teclado=new Scanner(System.in);
    dato = teclado.nextInt();
    return dato;    
    }
    public static double calcular1(int medida){//convertir Km/h a m/s
    return ((medida*1000)/3600);    
    }
    public static void mostrarresultado(int medida,double resultado1){
    System.out.println(medida +" Km/h es igual a: "+resultado1+" m/s ");
    }
    }
