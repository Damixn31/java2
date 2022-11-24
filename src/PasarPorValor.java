public class PasarPorValor {
    public static void main(String[] args) {
        // toda variable primitiva se pasa por valor y no por referencia porque no es un objeto
        int i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i (se mantiene igual) = " + i); // se mantiene con el mismo valor por que es inmutable
    }
    
    public static void test(int i) {
        System.out.println("iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metedo test con i = " + i);
    }
}
