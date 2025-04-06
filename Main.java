import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce la calificacion (numero entero del 0 al 10)");
        int nota = sc.nextInt();

        switch (nota) {
            case 10:
            System.out.println("matricula de honor");
                break;
            case 9:
            System.out.println("sobresaliente");
            break;
            
            case 8:
            case 7:
            System.out.println("Notable");
            break;

            case 6:
            System.out.println("Bien");
            break;

            case 5:
            System.out.println("Aprobado");
            break;

            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
            System.out.println("Suspenso");
            break;
        
            default:
            System.out.println("nota no valida, tiene que estar entre 0 y 10");
                break;
        }
    }
}