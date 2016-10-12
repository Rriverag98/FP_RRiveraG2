/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema6;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    int horas;
    double resultado1,resultado2,resultado3;
    horas=duracion();
    resultado1=calcular1(horas);
    mostrarresultado(horas,resultado1);
    }
    public static int duracion(){
    int dato;
    System.out.println("Introduce las horas trabajadas: ");
    Scanner teclado=new Scanner(System.in);
    dato = teclado.nextInt();
    return dato;    
    }
    public static double calcular1(int horas){
    if (horas>40&&horas<48){
    return (((horas-40)*18.25)+40*9.125);    
    } else {
    }
    if (horas>48){
    return (((horas-48)*27.375)+8*18.25+40*9.125);        
    } else{
    }
    return (horas*9.125);
    }
    public static void mostrarresultado(int horas,double resultado1){
    System.out.println(horas +" horas es igual a: "+resultado1+" MXP");
    }
    }