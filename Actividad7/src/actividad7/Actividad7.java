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
        System.out.println("La opcion elegida es: " + menú ());
        int a,b;
        double r1;
        double r2;
        double r3;
        final double Pi=3.14;
        a=SolicitarMedidas("A");
        b=SolicitarMedidas("B");
        r1=calcularCuadrado (a,b);
        r2=calcularCirculo (a,Pi);
        r3=calcularTriangulo (a,b);
        resultado1(a,b,r1);
        resultado2(a,b,r2);
        resultado3(a,b,r3);
    }
   
    
    public static int menú (){
        Scanner teclado = new Scanner (System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menú: ****");
        System.out.println("Intrudusca la opcion deseada:");
        System.out.println("1. Area de cuadrados.");
        System.out.println("2. Area de circulos.");
        System.out.println("3. Area de triangulos.");
        System.out.println("0. Salir.");
        opcion=teclado.nextInt();
        } while (opcion<0 || opcion>=4);
          return opcion;
    }
    public static int SolicitarMedidas (String d){
        Scanner teclado = new Scanner (System.in);
        int dato;
        System.out.println("Introduce el dato " + d);
        dato= teclado.nextInt();
        return dato;
    }
    public static float calcularArea(int op){
        float area;
        switch (op){
        case 1:
            area=areaCuadrado();
           
            break;
        case 2:
            area=areaCirculo();
           
            break;
        case 3:
            area=areaTriangulo();
          
            break;
        default:
            mensajeSalida();           
    } 
    return area;
  }
    //Procesos
  public static float areaCuadrado(){
      float datos;
      double SolicitarMedidas;
      double calcularCuadrado;
      double resultado1;
      return datos;
  }
   public static float areaCirculo(){
      double SolicitarMedidas;
      double calcularCuadrado;
      double resultado2;
      return datos;
  }
    public static float areaTriangulo(){
      double SolicitarMedidas;
      double calcularCuadrado;
      double resultado3;
      return datos;
  }
     public static void mensajeSalida(){
      String Salida;
  }
    //Calculos
  public static double calcularCuadrado(double dato1,double dato2){
      return (dato1*dato2);
  }
  public static double calcularCirculo(double dato1,double Pi){
      return Math.pow(dato1*Pi,2);
}
  public static double calcularTriangulo(double dato1,double dato2){
      return (dato1*dato2)/2;
}
  //Resultados
  public static void resultado1(double a,double b,double resultado){
   System.out.println("El resultado de la operacion ("+a+"*"+b+") es " + resultado);   
  }
  public static void resultado2(double a,double Pi,double resultado){
   System.out.println("El resultado de la operacion ("+Pi+"*"+a+")^2 es " + resultado);   
  }
  public static void resultado3(double a,double b,double resultado){
   System.out.println("El resultado de la operacion ("+a+"*"+b+")/2 es " + resultado);   
  }
  public static void Salida(){
   System.out.println("Lo sentimos, la operacion no puede llevarse a cabo");   
  }
}
