import java.util.Scanner;

public class BuscarNumeroMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int firstNum = s.nextInt();

        if (firstNum < 10) {
            System.out.println("Debe comparar al menos 10 numeros enteros!");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < firstNum; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero : menor;
            }
        }


    }
}
