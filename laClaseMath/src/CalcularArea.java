import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double area;
        double radio;
        System.out.println("Introducir el radio de un circulo: " );
        radio = s.nextDouble();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area de un circulo de radio = " + radio + " es: " + area);

    }
}
