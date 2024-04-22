package Ejercicios;

public class Ejercicio23 {

    private int numero1, numero2, resultado;

    public Ejercicio23(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void devolverResultado(){
        resultado = numero1 + numero2;

        System.out.println("La suma de ambos numero es igual a: " + resultado);
        
    }


}
