/*
- Sesión: S11 - Ámbito de las variables
- Ejercicio 02: Líneas que no compilan
- Enunciado: Las líneas con error comentadas (//), con el mensaje del compilador y la causa.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

public class Ej02_LineasNoCompilan {

    public static void probarAmbito() {
        int dato = 10;
        System.out.println("Dato: " + dato);
    }

    public static void main(String[] args) {
        if (true) {
            int clave = 99;
            System.out.println("Clave: " + clave);
        }

        // System.out.println(clave);
        // Error: cannot find symbol (variable clave)
        // Causa: es de bloque y solo existe dentro del if.

        // System.out.println(dato);
        // Error: cannot find symbol (variable dato)
        // Causa: es local de probarAmbito y no existe en main.

        probarAmbito();
    }
}