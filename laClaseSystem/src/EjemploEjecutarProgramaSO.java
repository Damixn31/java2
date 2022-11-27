import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("nodepad");

            } else  if(System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");

            } else  if(System.getProperty("os.name").toLowerCase().contains("linux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("code");

            }
            else {
                proceso = rt.exec("code");
            }
            proceso.waitFor(); //espera a que finalize la aplicacion
        }catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }
}
