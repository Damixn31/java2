import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // nos muestra el nombre de usuario
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        // nos muestra el directorio home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        // nos muestra la ruta donde esta nuestro proyecto
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator"); //salta a una nueva linea abajo
        String lineSeparator2 = System.lineSeparator(); // tambien hace el mismo resultado que el de arriba
        System.out.println("lineSeparator: " + lineSeparator + " una linea nueva...");

        // alista toda la propiedades que podemos usar
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
