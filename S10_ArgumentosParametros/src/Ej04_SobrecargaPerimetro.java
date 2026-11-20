public class Ej04_SobrecargaPerimetro {
    static double Perimetro(double lado){
        return lado*4;
    }
    static double Perimetro(double lado_a,double lado_b){
        return 2*(lado_a+lado_b);
    }
    public static void  main(String[] args){
        System.out.println("Perimetro del cuadrado: "+Perimetro(12));
        System.out.println("Perimetro de Rectangulo: "+Perimetro(8, 9));
        
    }

}