import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        //String[] nombres = new String[6]; // esta es una forma
        String[] nombres = {"Andres", "Damian", "Pepe", "Maria", "Lalo", "Nicolas", "bruno", "pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("damian")) {
                continue;
            }
            System.out.println(i + " = " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, Ejemplo \"Pepe\" o \"Damian\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if(encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado:");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }

    }
}
