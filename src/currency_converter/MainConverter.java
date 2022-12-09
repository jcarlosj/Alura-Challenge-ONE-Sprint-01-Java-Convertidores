package currency_converter;

import javax.swing.*;

public class MainConverter {
    public static void main(String[] args) {
        // Cuadro de dialogo menú principal
        Object[] possibleValues = { "Seleccione...", "Conversor de moneda", "Conversor de temperatura" };
        Object selectedValue = JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibleValues,
                possibleValues[ 0 ]
        );
    }
}
