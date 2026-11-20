/*
- Sesión: S11 - Ámbito de las variables
- Ejercicio 04: Reescribir sin static
- Enunciado: La versión original (comentada) y la nueva, que use parámetros y return.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

/*
public class Original {
    static int puntos = 0;

    public static void sumar() {
        puntos += 10;
    }

    public static void main(String[] args) {
        sumar();
        System.out.println(puntos);
    }
}
*/

public class Ej04_ReescribirSinStatic {

    public static int sumar(int puntosActuales) {
        return puntosActuales + 10;
    }

    public static void main(String[] args) {
        int puntos = 0;
        puntos = sumar(puntos);
        System.out.println("Puntos: " + puntos);
    }
}