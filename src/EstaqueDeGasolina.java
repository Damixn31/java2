import java.util.Scanner;

public class EstaqueDeGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cantidad de litros");
        double capacidad = scanner.nextDouble();

        if(capacidad == 70) {
            System.out.println("Estanque lleno");
        } else if(capacidad >= 60 && capacidad < 70) {
            System.out.println("Estaque casi lleno" );
        } else if(capacidad >= 40 && capacidad < 60) {
            System.out.println("Estaque 3/4");
        } else if(capacidad >= 35 && capacidad < 40) {
            System.out.println("Medio Estanque");
        } else if(capacidad >= 20 && capacidad < 35) {
            System.out.println("Suficiente");
        } else if(capacidad >= 1 && capacidad < 20) {
            System.out.println("Insuficiente");
        }
    }
}
