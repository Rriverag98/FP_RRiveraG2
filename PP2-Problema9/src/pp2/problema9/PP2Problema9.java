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
        int num;
        num=Numero();
        Convertir(num);
    }
    public static int Numero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entre el 0 y el 4000: ");
        int num=entrada.nextInt();
        while(num<=0||num>=4000){
            num = Numero();
        }
        return num;
    }
    public static void Convertir(int num){
        for(int i=10;i<num*10;i=i*10){
            System.out.print(((num%i)/(i/10))*(i/10));
            if ((i<num))System.out.print(" + ");
        }
        System.out.print(" = "+num + " ");
    } 
    }
