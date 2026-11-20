/*
- Sesión: S11 - Ámbito de las variables
- Ejercicio 03: Traza del contador static
- Enunciado: Programa y, en un comentario, la tabla línea | variables vivas | valor.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

/*
línea    | variables vivas   | valor
----------------------------------------
inicio   | veces            | veces = 0
llamar 1 | veces, n         | veces = 1, n = 5
llamar 2 | veces, n         | veces = 2, n = 3
final    | veces            | veces = 2
*/

public class Ej03_TrazaContadorStatic {

    static int veces = 0;

    public static int duplicar(int n) {
        veces++;
        return n * 2;
    }

    public static void main(String[] args) {
        System.out.println("Llamada 1: " + duplicar(5));
        System.out.println("Llamada 2: " + duplicar(3));
        System.out.println("Veces ejecutado: " + veces);
    }
}
