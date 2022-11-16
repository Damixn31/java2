import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nAOne= JOptionPane.showInputDialog(null, "Ingresa nombre y apellido");
        String nATwo= JOptionPane.showInputDialog(null, "Ingresa nombre y apellido");
        String nAThree= JOptionPane.showInputDialog(null, "Ingresa nombre y apellido");

        String moreLong = (nAOne.split(" ")[0].length() < nATwo.split(" ")[0].length()) ? nATwo : nAOne;
        moreLong = (nAThree.split(" ")[0].length() < moreLong.split(" ")[0].length()) ? moreLong : nAThree;

        System.out.println("La persona con el nombre mas largo es = " + moreLong);

    }
}
