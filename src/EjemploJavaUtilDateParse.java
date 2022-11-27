import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una Fecha con formato 'yyyy-MM-dd' ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            
            if(fecha.after(fecha2)) {
                System.out.println("Fecha (del usuario) es despues que fecha2 (actual)");
            } else if(fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if(fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
            }

            //otra manera de comprar
            if(fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha (del usuario) es despues que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Fecha es igual a fecha2");
            }
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato Incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd");
            //System.exit(1);
            main(args); // vuelve a invocar el programa y se vuelve a ejecutar(pregunta de nuevo)
        }


    }
}
