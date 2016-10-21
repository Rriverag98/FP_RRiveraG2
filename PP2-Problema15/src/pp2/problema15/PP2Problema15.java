/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema15;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [][] tabla = new int [11][11];
     int numeros;
     numeros = rnumeros();
     tabla = llenar(tabla);
     //tabla = llenarVector(tabla);
     mostrartabla(tabla);
    }
     public static int [][] llenar(int [][] tabla){ 
         for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                if(j==10){
                    int s=0;
                    for (j=0;j<tabla.length-1;j++){
                        s=tabla[i][j]+s;
                    }
                    tabla[i][j]=s;
                } else tabla[i][j]=rnumeros();
                if(i==10){
                    int s=0;
                    for(i=0;i<tabla.length-1;i++){
                        s=tabla[i][j]+s;
                    }
                    tabla[i][j]=s;
            }
        }
    }
    return tabla;
    }
    public static int rnumeros(){
    int n;
    Random ran= new Random();
    n =ran.nextInt(100);
    return n;
    }
    public static void mostrartabla(int [][]tabla){
    for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                System.out.print(tabla[i][j]+"\t");
            }
            System.out.print("\n");   
    }
}
}
