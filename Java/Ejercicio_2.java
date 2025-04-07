package Java;

public class Ejercicio_2 {
    public static void main(String[] args) {
        // Declaración de meses y días
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        int[] diasPormes = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Bucle para recorrer los meses
        for (int i = 0; i < meses.length; i++) {
            System.out.println("Mes: " + meses[i]);

            int dias = diasPormes[i];
            int semanas = (dias + 6) / 7; // Redondeo para cubrir semanas incompletas

            // Bucle para imprimir las semanas del mes
            for (int semana = 1; semana <= semanas; semana++) {
                System.out.println("  Semana " + semana);
            }

            System.out.println(); // Espacio entre meses
        }
    }
}

