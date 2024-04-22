import java.util.Scanner;
import Ejercicios.Ejercicio15;
import Ejercicios.Ejercicio16;
public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            
            System.out.println("1 - Ejercicio 15");
            System.out.println("2 - Ejercicio 16");
            System.out.println("3 - Ejercicio 22");
            System.out.println("4 - Ejercicio 23");
            System.out.println("5 - Ejercicio 24");
            System.out.println("7 - Ejercicio 25");
            System.out.println("8 - Ejercicio 26");
            System.out.println("9 - Salir");
            System.out.print("Ingrese el numero de ejercicio: ");
            Scanner opcionScanner = new Scanner(System.in);
            opcion = opcionScanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio15 ejer15 = new Ejercicio15();
                    ejer15.numeros();
                    
                    break;
                case 2:
                    Ejercicio16 ejer16 = new Ejercicio16();
                    ejer16.binario();

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                default:
                    break;
            }
        } while (opcion != 9);
    }
}
