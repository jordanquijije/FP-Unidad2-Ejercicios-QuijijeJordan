/*
 * Sesión: S10 - Argumentos y parametros
 * Ejercicio 01: Intercambiar a y b
 * Enunciado: Código, y en un comentario la respuesta a "¿funciona? ¿por qué?".
 * Autor: Quijije Jordan
 * Fecha: 19/11/2026
 */
public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a,int b){
        int temporal= a ;
         a =b;
         b = temporal;
         System.out.println("a = "+a+" y b = "+b);

    }
    public static void main(String[] args){
        intercambiar(5, 8);

    }
    
}/*Este codigo si funciona pero de cierto modo no termina de ser la mejor opcion ya que no contiene arreglos
y aunque no sea la forma adecuada su ejecucion y copilacion si funcionan y cambia los valores de a y b de un forma un poco creativa 
para que no suceda un erro de sintaxis al poner que a es igual b estariamos afirmando que los dos contienen el mismo valor
para esto utilizamos una variable temporal que nos sirve como punto de referecia para que asi cada quien contenga el numero 
intercambiado que es lo que pide el ejercicio */