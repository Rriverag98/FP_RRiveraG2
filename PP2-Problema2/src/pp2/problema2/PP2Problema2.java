/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema2;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int medida;
    double resultado1,resultado2,resultado3;
    medida=metros();
    resultado1=calcular1(medida);
    resultado2=calcular2(medida);
    resultado3=calcular3(medida);
    mostrarresultado(medida,resultado1,resultado2,resultado3);
    }
    public static int metros(){
    int dato;
    System.out.println("Introduce la medida en metros: ");
    Scanner teclado=new Scanner(System.in);
    dato = teclado.nextInt();
    return dato;    
    }
    public static double calcular1(int medida){
    return (medida*3.28084);    
    }
    public static double calcular2(int medida){
    return (medida*1.09361); 
    }
    public static double calcular3(int medida){
    return (medida*0.000621371); 
    }
    public static void mostrarresultado(int medida,double resultado1,double resultado2,double resultado3){
    System.out.println(medida +" metros es igual a: "+resultado1+" pies / "+resultado2+" yardas / "+resultado3+" millas ");
    }
    }
    