public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBolean = num1 > num2; // false
        //Boolean objBoolean = false; // implicita
        // esto se conoce como boxing
        Boolean objBoolean = Boolean.valueOf(primBolean); // explicita
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBolean = " + primBolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparamos dos objetos boolean " + (objBoolean == objBoolean2)); //aca compara por el valor esta es la diferencia con numeros
        System.out.println("comparamos dos objetos boolean " + (objBoolean.equals(objBoolean2)));
        System.out.println("comparamos dos objetos boolean " + (objBoolean2 == objBoolean3));
        System.out.println("comparamos dos objetos boolean " + (objBoolean == objBoolean3));

        // esto se conoce como unboxing

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
