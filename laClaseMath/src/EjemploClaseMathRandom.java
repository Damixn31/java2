import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"}; // indice 5

        // este es un metodo para generar un numero aleatorio un decimal entre 0 1, pero el 1 no es inclusive nunca llega a 1
        double random = Math.random();
        System.out.println("random = " + random);

        // tenemos que redondiar para abaja para que no se incluya el 6 porque si no va tirar un error que se desbordo el arreglo porque en este caso no existe el elemento en la posicion 6
        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random); // le sacamos el piso para redondiar para abajo y que los colores no llegue al inidce 6 que no existe
        System.out.println("random = " + random);

        System.out.println("colores aleatorios = " + colores[(int) random]); //se le pone int porque si no va a saltar error

        //la clase random es mas flexible y vas variable a la hora de generar numeros aleatorios con rangos mucho mas amplios
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(); // retorna un numero de manera uniforme puede ser negativo o positivo
        System.out.println("randomInt = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        int randomInt2 = randomObj.nextInt(7); // genera un numero aleatorio pero el 7 no se incluye si quiero incluir el 7 tengo que pasarle por argumento + 1
        System.out.println("randomInt2 = " + randomInt2);

        int randomIntRango = 15 + randomObj.nextInt(25 - 15); // nos va retornar un valor aleatorio dentro del rango de 15 y 25, y el 25 no se incluye si quiero incluirlo + 1
        System.out.println("randomIntRango = " + randomIntRango);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]); // como es un entero no hay q hacer ningun cast
    }
}
