import java.util.Scanner;

public class OrdenarDeMayorAMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa primer numero");
        int numOne = scanner.nextInt();

        System.out.println("Ingresa Segundo Numero");
        int numTwo = scanner.nextInt();

        String result = (numOne > numTwo) ? numOne + " y " + numTwo : numTwo + " y " + numOne;
        System.out.println("Ordenado de Mayor a Menor = " + result);

    }
}
