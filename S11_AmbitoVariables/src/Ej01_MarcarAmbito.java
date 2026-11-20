/*
- Sesión: S11 - Ámbito de las variables
- Ejercicio 01: Marcar ámbitos
- Enunciado: Programa con un comentario en cada variable que diga si es local, de bloque o static.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

public class Ej01_MarcarAmbito {

    static int contador = 0; // static

    public static int sumar(int a, int b) { // a y b son locales
        int total = a + b; // local
        contador++; // static
        return total; // local
    }

    public static void main(String[] args) {
        int x = 4; // local
        int y = 6; // local

        if (x > 0) {
            int extra = 2; // de bloque
            x = x + extra; // local y de bloque
        }

        int resultado = sumar(x, y); // local
        System.out.println("Resultado: " + resultado);
        System.out.println("Contador: " + contador);
    }
}