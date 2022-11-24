public class WrapperInteger {
    public static void main(String[] args) {
        // convertir el numero primitivo a un objeto
        int intPrimitivo = 32768;
        // estas son dos maneras de hacerlo de estas dos maneras es correctas
        Integer intObjeto = Integer.valueOf(intPrimitivo); //esta es explicita
        Integer intObjeto2= 32768;  //esta es implicita
        System.out.println("intObjeto = " + intObjeto);

        // convertir un objeto a numero primitivo hay dos maneras
        int num = intObjeto; // esta es la manera implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // esta es la manera explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); // mientras que el valor sea menor al que soporta no vamos a tener perdidas de datos en este caso nos va decir por consola -32788

        Byte byteObjeto = intObjeto.byteValue(); // el maximo es 127 de un byte
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
