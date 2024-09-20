package programas;
public class Programa02 {
    public static void main(String[] args) {
    int num,suma;
    num=10;
    suma=0;
        while (num>0) {
            suma=suma+num;
            num--;        
        }
        //salida de datos
        System.out.println("La suma es: " +suma);
    }
}

