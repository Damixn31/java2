public class SentenciaForEach {
    public static void main(String[] args) {
         int[] numeros = {1, 3, 5, 7, 9,13, 14};
         for(int num: numeros) {
             System.out.println("num = " + num);
         }

        String[] nombres = {"Andres", "Damian", "Pepe", "Maria", "Lalo", "Nicolas", "bruno", "pepa"};

         for(String name: nombres) {
             System.out.println("name = " + name);
         }
    }
}
