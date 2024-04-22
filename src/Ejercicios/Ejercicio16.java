package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public void binario() {
        int numero, numeroOriginal;
        Scanner numeroScanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal: ");
        numero = numeroScanner.nextInt();
        numeroOriginal = numero;
        String binario = "";
        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }
        System.out.println("El número " + numeroOriginal + " en binario es: " + binario);
    }
}
