package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
    //declarar variables
    int dni,intentos;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.println("Por favor, ingrese el número de su DNI: ");
    dni=lectura.nextInt();
    //proceso de datos
    intentos=2;
        while (dni!=72546855 && intentos>0) {
            System.out.println("Ingrese el número correcto");
            dni=lectura.nextInt();
            intentos--;
            System.out.println("Le queda " + intentos + " intento");
            }
        if (dni==72546855) {
            System.out.println("El número es correcto");   
            System.out.println("Puede ingresar");
        }
    }
}
