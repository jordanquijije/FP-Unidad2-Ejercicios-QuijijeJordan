 /*
- Sesión: S10 - Argumentos y parámetros: paso por valor
- Ejercicio 03: Aplicar descuento a un arreglo de precios
- Enunciado: Código que modifique el arreglo y lo imprima antes y después.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */
public class Ej03_AplicarDescuento {
    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            double rebajaPrecio = precios[i] * pct;
            precios[i] = precios[i] - rebajaPrecio;
            
        }
    }
    static void mostrarPrecios(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("Producto %d: $%.2f%n", (i + 1), precios[i]);
        }
    }
     public static void main(String[] args) {
        double[] precios = {100.0, 45.50, 80.0, 120.75, 15.0};
        double descuento = 0.15;
        System.out.println("Precios antes del descuento:");
        mostrarPrecios(precios);
        aplicarDescuento(precios, descuento);
        System.out.println("Precios después del " + descuento + "% de descuento:");
        mostrarPrecios(precios);
    }
}