package Java;

import java.util.Scanner;

class Ejercicio_1 {

    public static void main(String[]args){
        //1 ENUNUCIADO: Desarrolla un algoritmo que, dado un número decimal, devuelve su resultado entero redondeado siguiendo estas normas:
        //        //Todos los números decimales por debajo de ,5 se redondean a la baja.
        //        //Los que tengan decimales desde ,5 a superior, se redondean al alza.

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la nota del alumno con decimales (separados con coma)");
        double notaAlumno= sc.nextDouble();

        System.out.println("La nota redondeada del alumno es: " + Math.round(notaAlumno));
        sc.close();

    }
}