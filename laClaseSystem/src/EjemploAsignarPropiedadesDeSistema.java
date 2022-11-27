import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("laClaseSystem/src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p); // aca me muestra mis configuraciones personalizada
            
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...    ) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.puerto.email"));

            ps.list(System.out); 
        }catch (Exception e) {
            System.out.println("no existe el archivo" + e);
            System.exit(1); // ponemos el 1 cuando para saber si hay una falla si se rompe el flujo de nuestra aplicacion y con exit() nos salismos del programa
        }


    }
}
