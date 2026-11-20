/*
- Sesión: S12 - Métodos de biblioteca
- Ejercicio 04: Contar vocales
- Enunciado: Usar String y Character, contando mayúsculas y minúsculas.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

public class Ej04_ContarVocales {

    // Cuenta vocales sin importar si son mayúsculas o minúsculas
    public static int contarVocales(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String frase = "Fundamentos de Programacion";
        int totalVocales = contarVocales(frase);

        System.out.println("Texto: " + frase);
        System.out.println("Total de vocales: " + totalVocales);
    }
}