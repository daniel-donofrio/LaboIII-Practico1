package Ejercicios;

import javax.print.DocFlavor.STRING;

public class Ejercicio24 {

    //Escriba un programa que defina una clase con una variable de instancia privada y
    //métodos públicos para establecer y obtener el valor de la variable.

    private String nombre;
    private int edad;
    private double altura;

    public Ejercicio24(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad =  edad;
        this.altura = altura;
    }

    public String getnombre(){
        return nombre;
    }
    public int getedad(){
        return edad;
    }
    public double getaltura(){
        return altura;
    }

    public void setnombre(String nuevonombre){
        this.nombre = nuevonombre;
    }

    public void setedad (int nuevaedad){
        this.edad = nuevaedad;
    }

    public void setaltura(double nuevaaltura){
        this.altura = nuevaaltura;
    }

       
}
