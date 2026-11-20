/*
- Sesión: S12 - Métodos de biblioteca
- Ejercicio 03: Validar contraseña
- Enunciado: Mínimo 8 caracteres, una mayúscula y un dígito, usando Character.
- Autor: Quijije Jordan
- Fecha: 20/11/2026
 */

public class Ej03_ValidarContrasena {

    // Revisa longitud, mayúscula y dígito con Character
    public static boolean esValida(String clave) {
        if (clave == null || clave.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        return tieneMayuscula && tieneDigito;
    }

    public static void main(String[] args) {
        String prueba1 = "Clave2026";
        String prueba2 = "claveorta";

        System.out.println(prueba1 + " -> válida: " + esValida(prueba1));
        System.out.println(prueba2 + " -> válida: " + esValida(prueba2));
    }
}