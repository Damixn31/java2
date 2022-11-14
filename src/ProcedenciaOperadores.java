public class ProcedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        //double promedio = i + j + k / 3d; //primero divide y despues hace la suma
        double promedio = (i + j + k) / 3d;// importante usar parentesis para dar prioridad
        System.out.println("promedio = " + promedio);

        //promedio = i + j + k / 3d * 10; // primero divide segundo divide el resultado y despues suma
        promedio = i + j + k / (3d * 10);
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; // primero incrementa el i y suma 15 + 8, despues lo va a sumar con el resultado de k / 3d, y despues ese resultado lo multiplica por 10.
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j); // el valor de j aca es 7
    }
}
