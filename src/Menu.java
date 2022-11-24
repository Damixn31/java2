import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {

        int opcionIndice = 0;
        do {
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null, "Seleccione una Opcion", "Mantenedor de Productos", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operacion");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice) {
                    case 1 -> {
                        mensaje = "Usuario actualizado correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 2 -> {
                        mensaje = "Usuario elimino correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 3 -> {
                        mensaje = "Usuario agrego correctamente";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                    case 4 -> {
                        mensaje = "Listando a los usuarios";
                        JOptionPane.showMessageDialog(null, mensaje);
                        System.out.println(mensaje);
                    }
                }
            }
        } while (opcionIndice != 5);
        JOptionPane.showMessageDialog(null, "Saliste con exito!");
    }
}
