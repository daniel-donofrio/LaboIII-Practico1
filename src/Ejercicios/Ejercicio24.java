package Ejercicios;

public class Ejercicio24 {

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
