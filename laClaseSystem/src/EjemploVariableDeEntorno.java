import java.util.Map;

public class EjemploVariableDeEntorno {
    public static void main(String[] args) {
        // nota los que aparecen en null es porque no son del mismo nombre del sistema o hay que reiniciar el editor de texto
        Map<String, String> varEnv = System.getenv();
        System.out.println("variable de ambiente del sistema = " + varEnv);

        System.out.println("-------- Listando variables de entorno del sistema -------");
        for(String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("HOSTNAME");
        System.out.println("username = " + username);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String temDir = System.getenv("PWD");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("path"); // tambien se puede obtener la ruta con varEnv.get()
        System.out.println("path = " + path2);
    }
}
