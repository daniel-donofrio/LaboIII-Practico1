package Ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
    public void numeros(){
        int numeros[];
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            Scanner numScanner = new Scanner(System.in);
            System.out.print("Ingrese el numero de la posicion " + i + ": ");
            numeros [i] = numScanner.nextInt();
        }
        System.out.print("La lista de numeros ingresada es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.print("La lista de numeros ordenada es: ");
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int auxiliar=numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
