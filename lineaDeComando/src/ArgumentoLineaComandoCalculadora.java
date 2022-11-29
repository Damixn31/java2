public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.err.println("Por favor ingresar una operacion " +
                    "(suma, resta, multiplicacion, division) y dos numeros enteros!");
            System.exit(-1); // nos salimos con un codigo de error si el usuario ingreso mal
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (NumberFormatException e) {
            System.err.println("Cuidado a y b tiene que ser numeros enteros, vuelva a intentar!");
            System.exit(-1);
        }
        
        switch (operacion) {
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "mult":
                resultado = a*b;
                break;
            case "div":
                if (b == 0) {
                    System.err.println("No se puede dividir por cero!");
                    System.exit(-1);
                }
                resultado = (double) a/b; // como nos puede salir un decimal lo convertimos en double a la division
                break;
            default:
                resultado = a+b;

        }
        System.out.println("resultado de la operacion  '" + operacion + "' es: " + resultado);
    }
}
