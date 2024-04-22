package Ejercicios;

public class Ejercicio25 {

    private int numero1, numero2;

    public Ejercicio25(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public static void calcularResta(int numero1, int numero2){
        int resulrado = numero1 - numero2; 
        System.out.println("El resultado de la resta es igual a: "+ resulrado); 
    }
}
