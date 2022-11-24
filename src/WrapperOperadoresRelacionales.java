public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        // java tiene una particularidad que si comparamos a un valor de 127 todo va a ser true es una particularidad
        // si es 127 o menor siempre va a comprar por su valor y no por su instancia y si es mayor siempre va a comprar por la instancia
        Integer num1 = Integer.valueOf(1000); //si aca la pasamos el valor 127 va comparar por valor
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // el == compara por valores promitivos
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000; //si aca le pasamos 127 va a comparar por valor

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // comparar con el valor

        System.out.println("Tiene el mismo valor? " + (num1.equals(num2))); //el equals() por valores de tipos de referencias
        System.out.println("Tiene el mismo valor? " + (num1.intValue() == num2.intValue())); // cuando usamos el == en referencia compara la instancia y no su valor

        num2 = 500; //esta es una nueva instancia
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
