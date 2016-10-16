/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema9;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String numero;
     numero = digitos();
     String var = (numero);
      char cad[];
     cad=var.toCharArray();
          System.out.println(cad[0]+"000 + "+cad[1]+"00 + "+cad[2]+"0 + "+cad[3]+" = "+numero);
     
    }
    //pedir un numero de 4 digitos, si es mayor o menor de manda error y pide el numero de nuevo hasta que se introdusca un numero de 4 digitos
     public static String digitos() {
     String n;
     System.out.print("Ingresa un numero de 4 digitos: " ); 
    Scanner teclado = new Scanner(System.in);
    n=teclado.nextLine();
    //Si el numero tiene mas de 4 digitos mandar error y pedir otra vez el numero
    while (n.length()>4){
            System.out.println("Error: El numero no es valido ");
            System.out.print("Ingresa un numero de 4 digitos: " );
            n=teclado.nextLine();
            //Si el numero es menor a 4 digitos mandar error y pedir otra vex el numero
            while (n.length()<4){ System.out.println("Error: El numero no es valido ");
            System.out.print("Ingresa un numero de 4 digitos: " );
            n=teclado.nextLine();
       }
    //Si el numero tiene menos de 4 digitos mandar error y pedir otra vez el numero
    }while (n.length()<4){
            System.out.println("Error: El numero no es valido ");
            System.out.print("Ingresa un numero de 4 digitos: " );
            n=teclado.nextLine();
            // si el numero es mayor a 4 mandar error y pedir otra vez el numerol
            while (n.length()>4){ System.out.println("Error: El numero no es valido ");
            System.out.print("Ingresa un numero de 4 digitos: " );
            n=teclado.nextLine();
    }
}return n;
}
}
