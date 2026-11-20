/*
- Sesión: S12 - Métodos de biblioteca
- Ejercicio 02: Dados que suman 7
- Enunciado: 1000 lanzamientos con Random, mostrar el conteo y el porcentaje.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int lanzamientos = 1000;
        int conteoSuma7 = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = aleatorio.nextInt(6) + 1; // 1 a 6
            int dado2 = aleatorio.nextInt(6) + 1; // 1 a 6

            if (dado1 + dado2 == 7) {
                conteoSuma7++;
            }
        }

        double porcentaje = (conteoSuma7 * 100.0) / lanzamientos;
        System.out.println("Veces que sumaron 7: " + conteoSuma7);
        System.out.printf("Porcentaje: %.2f%%%n", porcentaje);
    }
}