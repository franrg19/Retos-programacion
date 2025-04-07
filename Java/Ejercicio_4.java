package Java;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main (String []args){
     Scanner sc = new Scanner (System.in);

     System.out.println("Introduce un numero donde quieres que empiece la cuenta atras");

     for(int i = sc.nextInt();i>0;i--){
        System.out.println(i);
     }

     System.out.println("¡¡¡ BOOM !!!");
     sc.close();

    }
}
