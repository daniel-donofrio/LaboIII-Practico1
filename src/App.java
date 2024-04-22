import java.util.Scanner;
import Ejercicios.Ejercicio15;
import Ejercicios.Ejercicio16;
import Ejercicios.Ejercicio22;
import Ejercicios.Ejercicio23;
import Ejercicios.Ejercicio24;
import Ejercicios.Ejercicio25;
import Ejercicios.Ejercicio26;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        do {
            
            System.out.println("1 - Ejercicio 15");
            System.out.println("2 - Ejercicio 16");
            System.out.println("3 - Ejercicio 22");
            System.out.println("4 - Ejercicio 23");
            System.out.println("5 - Ejercicio 24");
            System.out.println("6 - Ejercicio 25");
            System.out.println("7 - Ejercicio 26");
            System.out.println("8 - Salir");
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
                    Ejercicio22 ejer22 = new Ejercicio22("Gabriel Ponce",42);
                    ejer22.mostrarVariable();               
                    break;
                case 4:
                    Ejercicio23 ejer23 = new Ejercicio23(4, 8);
                    ejer23.devolverResultado();
                    break;
                case 5:
                    Ejercicio24 ejer24 = new Ejercicio24("Gabriel Ponce", 42, 1.82);
                    
                    String nombre = ejer24.getnombre();
                    int edad = ejer24.getedad();
                    double altura = ejer24.getaltura();

                    System.out.println("Su nombre es " +nombre+ ", tiene " +edad+ " años y su altura es  " +altura+ " metros" );

                    ejer24.setnombre("Daniel D'Onofrio");
                    ejer24.setedad(36);
                    ejer24.setaltura(1.78);
                    
                    System.out.println("Su nombre es " +ejer24.getnombre()+ ", tiene " +ejer24.getedad()+ " años y su altura es  " +ejer24.getaltura()+ " metros" );

                    break; 
                case 6:
                    int resultado = Ejercicio25.calcularResta(8,9);
                    System.out.println("El resultado de la resta es igual a: " + resultado);
                    break;
                case 7:
                    Ejercicio26 ejer26 = new Ejercicio26(3.1416f);
                    ejer26.mostrarvariable();
                    break;
                default:
                    break;
            }
        } while (opcion != 8);
    }
}
