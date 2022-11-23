import java.util.Scanner;

public class NotasFinales {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double[] notas = new double[10];
        int notaMasCinco = 0;
        int notaMenosCuatro = 0;
        int notaUno = 0;
        double promedioMasCinco = 0;
        double promedioMenosCuatro = 0;
        double totalDeNotasMasCinco = 0;
        double totalDeNotasMenosCuatro = 0;
        boolean terminado = false;

        etiquetaNota:
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa la "+ (i+1) +" nota del 1 al 7: ");
            notas[i] = s.nextDouble();
            if(notas[i] > 5) {
                ++notaMasCinco;
                totalDeNotasMasCinco = totalDeNotasMasCinco + notas[i];
            }
            if(notas[i] < 4) {
                ++notaMenosCuatro;
                totalDeNotasMenosCuatro = totalDeNotasMenosCuatro + notas[i];
            }
            if(notas[i] == 1) {
                ++notaUno;
            }
            if(notas[i] <=0 || notas[i] > 7) {
                terminado = true;
                break etiquetaNota;
            }
        }
        if(terminado) {
            System.out.println("La nota no esta dentro del rango, vuelve a ingresar al programa!");
            System.exit(0);
        }
        promedioMasCinco = totalDeNotasMasCinco / notaMasCinco;
        promedioMenosCuatro = totalDeNotasMenosCuatro / notaMenosCuatro;

        System.out.println("El promedio de notas mayores a 5 es: " + promedioMasCinco);
        System.out.println("El promedio de notas menores a 4 es: " + promedioMenosCuatro);
        System.out.println("La cantidad de unos es: " + notaUno);
    }
}
