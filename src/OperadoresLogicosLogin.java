import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "damian";
        String password = "12345";

        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Username");

        String u = scanner.next();

        System.out.println("Ingrese Password");

        String p = scanner.next();

        boolean esAutenticado = false;

        if( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p)) ) {
            esAutenticado = true;
        } else {
            System.out.println("Usruario O Contrasenia Incorrecta!");
        }
        if(esAutenticado) {
            System.out.println("Bienvenido ".concat(u).concat("!"));
        } else {
            System.out.println("Necesita Autenticacion");
        }
    }
}
