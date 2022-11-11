import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "damian";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        // Forma mas simplificada
        String[] usernames = {"damian", "admin", "pepe"};
        String[] passwords = {"123", "222", "333"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Username");

        String u = scanner.next();

        System.out.println("Ingrese Password");

        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++) {
            //ternario
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;

            /* if( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido ".concat(u).concat("!") :
                "Usuario o Contrasenia Incorrecta!\nNecesita Autenticacion";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado) {
            System.out.println("Bienvenido ".concat(u).concat("!"));
        } else {
            System.out.println("Usruario O Contrasenia Incorrecta!");
            System.out.println("Necesita Autenticacion");
        }*/
    }
}
