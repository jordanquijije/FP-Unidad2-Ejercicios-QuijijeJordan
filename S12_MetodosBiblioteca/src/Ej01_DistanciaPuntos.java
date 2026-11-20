/*
- Sesión: S12 - Métodos de biblioteca
- Ejercicio 01: Distancia entre dos puntos
- Enunciado: Usar Math.sqrt y Math.pow.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

public class Ej01_DistanciaPuntos {

    // Calcula la distancia euclidiana entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static void main(String[] args) {
        double x1 = 1.0, y1 = 2.0;
        double x2 = 4.0, y2 = 6.0;

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("Distancia entre puntos: " + distancia);
    }
}