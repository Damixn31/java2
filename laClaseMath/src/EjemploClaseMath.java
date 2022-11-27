public class EjemploClaseMath {
    public static void main(String[] args) {

        //calcular el valor absoluto de un numero entero ya sea positivo o negativo
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // maximo entre dos numeros enteres puede ser decimal, double, float, int
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // para redondear un numero
        double techo = Math.ceil(3.5); // va a redondiar para arriba asi que su valor a ser 4.0
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); // va a redondiar para abajo su valor va a ser 3.0
        System.out.println("piso = " + piso);

        //redondiar simplemente un valor decimal de forma automatica
        long entero = Math.round(3.3);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1); // el exponente
        System.out.println("exp = " + exp);

        double log = Math.log(10); // logaritmo natural de 10
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); //raizcuadrada de 5
        System.out.println("raiz = " + raiz);

        // para convertir un angulo en radianes a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        // convertir a la manera inversa ahora de grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90) " + Math.sin(radianes));
        System.out.println("cos(90) " + Math.cos(radianes)); //coseno

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180) " + Math.cos(radianes)); //coseno

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) " + Math.cos(radianes)); //coseno
    }
}
