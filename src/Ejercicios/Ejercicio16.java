package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public void binario() {
        int numero;
        Scanner numeroScanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal: ");
        numero = numeroScanner.nextInt();
        String binario = "";
        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }
        System.out.println("El número binario equivalente es: " + binario);
    }
}
