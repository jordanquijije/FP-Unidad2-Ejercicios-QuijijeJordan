/*
- Sesión: S10 - Argumentos y parámetros: paso por valor
- Ejercicio 05: Predicción de salida
- Enunciado: Programa con 3 llamadas, la salida predicha en un comentario y luego la salida real.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

/*
PREDICCIÓN DE SALIDA (antes de ejecutar):
- Llamada 1: sumarBonificacion(50, 15) -> imprime 65 dentro del método, pero 'puntos' en main sigue siendo 50 (paso por valor: el parámetro es una copia).
- Llamada 2: sumarBonificacion(puntos, 10) -> imprime 60 dentro del método, y 'puntos' en main sigue valiendo 50.
- Llamada 3: calcularTotal(100.0, 20.0) -> devuelve 80.0 y se guarda en 'totalFinal', así que en main imprime 80.0 porque sí usa return.
*/

public class Ej05_PrediccionSalida {

    public static void sumarBonificacion(int valorBase, int extra) {
        valorBase = valorBase + extra;
        System.out.println("Dentro del método (bonificación): " + valorBase);
    }

    public static double calcularTotal(double monto, double descuento) {
        return monto - descuento;
    }
    public static void main(String[] args) {
        int puntos = 50;
        double totalFinal;

        // 1ra llamada
        sumarBonificacion(puntos, 15);
        System.out.println("Tras llamada 1 -> puntos en main: " + puntos);

        // 2da llamada
        sumarBonificacion(puntos, 10);
        System.out.println("Tras llamada 2 -> puntos en main: " + puntos);

        // 3ra llamada
        totalFinal = calcularTotal(100.0, 20.0);
        System.out.println("Tras llamada 3 -> totalFinal en main: " + totalFinal);

        /*
        SALIDA REAL OBTENIDA:
        Dentro del método (bonificación): 65
        Tras llamada 1 -> puntos en main: 50
        Dentro del método (bonificación): 60
        Tras llamada 2 -> puntos en main: 50
        Tras llamada 3 -> totalFinal en main: 80.0
        Explicación: En las dos primeras llamadas, 'sumarBonificacion' modifica su propia copia local del parámetro
        y no altera 'puntos' en main. En la tercera, 'calcularTotal' retorna un valor que sí se asigna a 'totalFinal'.
        */
    }

}

