import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FechaDeNacimiento {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa una fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = s.next();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaNac = format.parse(fechaStr);
            Date actual = new Date();

            format = new SimpleDateFormat("yyyyMMdd");

            int desde = Integer.parseInt(format.format(fechaNac));
            int hasta = Integer.parseInt(format.format(actual));

            int edad = (hasta - desde) / 10000;
            System.out.println("Tu edad es = " + edad);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
