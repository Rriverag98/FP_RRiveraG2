/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int accion;
        float resultado;
        accion = menú();
        resultado=calcularArea(accion);
        System.out.println("El resultado de la operacion es: " + resultado);
    }
   
    
    public static int menú (){
        Scanner teclado = new Scanner (System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menú: ****");
        System.out.println("Introdusca la opcion deseada:");
        System.out.println("1. Area de cuadrados.");
        System.out.println("2. Area de circulos.");
        System.out.println("3. Area de triangulos.");
        System.out.println("0. Salir.");
        opcion=teclado.nextInt();
        } while (opcion<0 || opcion>3);
        System.out.println("La opcion elegida es: " + opcion);
          return opcion;
    }
    public static float SolicitarMedidas (String d){
        float dato;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el dato " + d);
        dato= teclado.nextFloat();
        return dato;
    }
    public static float calcularArea(int op){
        float area = 0; //Si no tiene el "= 0" ,Dice que no se inicializa la variable
        switch (op){
        case 1:
      float datos;
      double a;
      a=SolicitarMedidas("A");
      datos = (float)Math.pow(a,2);
      return datos;
      
        case 2:
      final double Pi=3.14;
      a=SolicitarMedidas("A");
      datos = (float) (Pi*Math.pow(a,2));
      return datos; 
        
        case 3:
      double b;
      a=SolicitarMedidas("A");
      b=SolicitarMedidas("B");
      datos = (float)(a*b)/2;
      return datos;
        
        default:
      System.out.println("Gracias, esperamos que te sirviera el programa");
      System.exit(0);          
    } 
    return area;
  }
}
