/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;

/**
 *
 * @author Rodrigo
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][] tabla = new int [7][7];
       tabla = llenar(tabla);
       ejecutar(tabla);
    }
    public static int [][] llenar(int [][] tabla){
          for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                if(i==j){
                    tabla[i][j]=1;
                } else {
                    tabla[i][j]=0;
                }
            }
        }
    return tabla;
}
    public static void ejecutar(int [][] tabla){
     for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla.length;j++){
                System.out.print(tabla[i][j]+"\t");
            }
            System.out.print("\n");   
    }
}
}
