/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;

import java.util.*;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    double Ang,Sen,Cos,Tan;
    Ang=Angulo();
    Sen=calcular1(Ang);
    Cos=calcular2(Ang);
    Tan=calcular3(Ang);
    mostrarresultado(Ang,Sen,Cos,Tan);
    }
    public static int Angulo() {
    int medida;
    System.out.print("Ingresa el angulo: " ); //pedir catetos
    Scanner teclado = new Scanner(System.in);
    medida=teclado.nextInt();
    return medida;
    }  
    public static double calcular1(double Ang){
    double a = Math.toRadians(Ang);
        return Math.sin(a);    
    }
    public static double calcular2(double Ang){
     double a = Math.toRadians(Ang);
        return Math.cos(a);  
    }
    public static double calcular3(double Ang){
     double a = Math.toRadians(Ang);
        return Math.tan(a);  
    }
    public static void mostrarresultado(double Ang,double Sen,double Cos,double Tan){
    System.out.println("El Seno del angulo "+Ang+" es: "+Sen);
    System.out.println("El Coseno del angulo "+Ang+" es: "+Cos);
    System.out.println("La Tangente del angulo "+Ang+" es: "+Tan);
    }
    }