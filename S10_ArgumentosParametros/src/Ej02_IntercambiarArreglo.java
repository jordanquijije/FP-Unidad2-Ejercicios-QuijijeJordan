/*
 * Sesión: S10 - Argumentos y parametros
 * Ejercicio 02:  intercambiar(int[] v, int i, int j)
 * Enunciado: Código, y en un comentario por qué ahora sí funciona
 * Autor: Quijije Jordan
 * Fecha: 20/11/2026
 */
import java.util.Arrays;
public class Ej02_IntercambiarArreglo {
    static void IntercambiarArreglo(int[] v,int i,int j){
        int temporal = v[i];
        v[i]=v[j];
        v[j]=temporal;
    }
    static void main(String[] args){
        int[] v={2,3};
        IntercambiarArreglo(v, 1, 0);
        System.out.println("El vector dado ser: "+Arrays.toString(v));
    }
}/*Este ejercicio a diferencia del anterior es una mejor opcion ya que este contiene los arreglos los cuale los 
podemos llamar gracias a que hemos importado la libreria de los Arrays y en este caso i e j son nuestras variables
igual establecemos una variable temporal para guardar una variable, ponemos nuestro conjunto  y por ultimo llamamos 
nuestros arreglos agregandoles las posiciones a i e j y mediante un println lo mostramos*/

