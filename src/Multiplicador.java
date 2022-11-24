import java.util.Scanner;

public class Multiplicador {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1;
        int num2;
        int result = 0;

        System.out.println("Ingrese primer numero: ");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = s.nextInt();

        if(num1 >= 0 && num2 >= 0) {
            for(int i = 1; i <= num2; i++) {
                result += num1;
            }
        }
        if(num1 <= 0 && num2 <= 0) {
            for(int i = 1; i <= (-num1); i++) {
                result += (-num2);
            }
        }
        if(num1 < 0 && num2 >= 0) {
            for(int i = 1; i <= num2; i++) {
                result += num1;
            }
        }
        if(num1 >= 0 && num2 <= 0) {
            for(int i = 1; i <= num1; i++) {
                result += num2;
            }
        }
        System.out.println("result = " + result);

    }
}
