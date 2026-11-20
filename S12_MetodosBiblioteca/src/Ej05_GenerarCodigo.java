/*
- Sesión: S12 - Métodos de biblioteca
- Ejercicio 05: Código de 6 caracteres
- Enunciado: 3 letras aleatorias y 3 dígitos aleatorios.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static String generarCodigo(Random rand) {
        StringBuilder codigo = new StringBuilder();

        // 3 letras mayúsculas aleatorias
        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + rand.nextInt(26));
            codigo.append(letra);
        }

        // 3 dígitos aleatorios
        for (int i = 0; i < 3; i++) {
            int digito = rand.nextInt(10);
            codigo.append(digito);
        }

        return codigo.toString();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        String codigoGenerado = generarCodigo(rand);
        System.out.println("Código generado: " + codigoGenerado);
    }
}