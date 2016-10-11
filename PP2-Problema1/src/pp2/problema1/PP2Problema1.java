/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema1;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Anyo;
    Anyo = Numero();
    calcular(Anyo);
    }
    public static void calcular(int Anyo){ 
    if ((Anyo%4)==0){//año dividido entre cuatro es entero
    } else {AnyoNormal();
    }
    if ((Anyo%100)==0){ //año dividido entre cien es entero
    } else {AnyoBisiesto();
    }
    if ((Anyo%400)==0){//año dividido entre cuatrocientos es entero
      AnyoBisiesto();   
    } else {AnyoNormal();  
    }
    }
    public static int Numero(){
    System.out.println("Introduce el año: ");
    int Dato;
    Scanner teclado = new Scanner(System.in);
    Dato = teclado.nextInt();
    return Dato;    
    }
    public static void AnyoNormal(){
     System.out.println("El año no es bisiesto");
     System.exit(0);
    }
    public static void AnyoBisiesto(){
        System.out.println("El año es bisiesto"); 
        System.exit(0);
    }
    
}
