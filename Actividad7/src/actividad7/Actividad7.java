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
            break;
    } return area;
    }
}
