public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        // usar un for es mas rapido
        // el while es pre prueba primero evalua ejecuta e itera
        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba) {
            if(i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        // do while post prueba primero ejecuta almenos una sola vez y despues valua la condicion es util cuando queremos hacer una tarea antes de evaluar una condicion
        // cuando queremos hacer algo al menos una vez pero segun una condicion pordemos volver a repetir este codigo
        do {
            System.out.println("se ejecuta al menos una vez"); // primero ejecuda despues prueba
        } while (prueba);

        prueba = true;
        i = 0;

        do {
            if(i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while(prueba);


    }
}
