/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema11;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PP2Problema11 {

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
        System.out.print("Ingrese un numero entre el 0 y el 4000: "); //No hay signo disponible para el numero 4000
        int num=entrada.nextInt();
        while(num<=0||num>=4000){//Si el numero es menor a 0 o mayor a 4000 pide numero hasta que no lo sea
            num = Numero();
        }
        return num;
    }
    public static void Convertir(int num){
        int a,p=0;
        String b="";
        String []array = new String[4];
        for(int i=10;i<=num*10;i=i*10){ //Revisa con multiplos de 10
            a = ((num%i)/(i/10))*(i/10); //toma el valor de num mod i
            if(a==0) b="";
            if(a>0&&a<10)b=unidades(a);
            if(a>9&&a<100) b=decenas(a);
            if(a>99&&a<1000) b=centenas(a);
            if(a>999&&a<10000) b=milares(a);
            array[p]=b; //Agrega la letra a un arreglo
            p++;
        }
        System.out.print("El numero "+num+" es ");
        for(int i=(array.length-1);i>=0;i--){ //muestra el arreglo en el orden correcto
            if (array[i]==null){System.out.print("");
                    } else{
                System.out.print(array[i]);
            }
        }
        System.out.print(" en romano \n");
    }
    public static String unidades(int num){
        String roman="";
        switch(num){
            case(1):
                roman="I";
                return roman;
            case(2):
                roman="II";
                return roman;
            case(3):
                roman="III";
                return roman;
            case(4):
                roman="IV";
                return roman;
            case(5):
                roman="V";
                return roman;
            case(6):
                roman="VI";
                return roman;
            case(7):
                roman="VII";
                return roman;
            case(8):
                roman="VII";
                return roman;
            case(9):
                roman="IX";
                return roman;
            default:
                System.out.println("Error");
        }
        return roman;
    }
    public static String decenas(int num){
        String roman="";
            switch(num){
                case(10):
                    roman="X";
                    return roman;
                case(20):
                    roman="XX";
                    return roman;
                case(30):
                    roman="XXX";
                    return roman;
                case(40):
                    roman="XL";
                    return roman;
                case(50):
                    roman="L";
                    return roman;
                case(60):
                    roman="LX";
                    return roman;
                case(70):
                    roman="LXX";
                    return roman;
                case(80):
                    roman="LXXX";
                    return roman;
                case(90):
                    roman="XC";
                    return roman;
                default:
                    System.out.println("Error");
            }
        return roman;
    }
    public static String centenas(int num){
        String roman="";
        switch(num){
            case(100):
                roman="C";
                return roman;
            case(200):
                roman="CC";
                return roman;
            case(300):
                roman="CCC";
                return roman;
            case(400):
                roman="CD";
                return roman;
            case(500):
                roman="D";
                return roman;
            case(600):
                roman="DC";
                return roman;
            case(700):
                roman="DCC";
                return roman;
            case(800):
                roman="DCCC";
                return roman;
            case(900):
                roman="CM";
                return roman;
            default:
                System.out.println("Error");
        }
        return roman;
    }
    public static String milares(int num){
        String roman="";
        switch(num){
            case(1000):
                roman="M";
                return roman;
            case(2000):
                roman="MM";
                return roman;
            case(3000):
                roman="MMM";
                return roman;
            default:
                System.out.println("Eror");
        }
        return roman;
    }
}