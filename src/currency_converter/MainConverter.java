package currency_converter;

import javax.swing.*;

public class MainConverter {
    public static void main(String[] args) {
        // Cuadro de dialogo menú principal
        String[] possibleValues = { "Seleccione...", "Conversor de moneda", "Conversor de temperatura" };
        String selectedValue = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción de conversión",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibleValues,
                possibleValues[ 0 ]
        );

        switch ( selectedValue ) {
            case "Conversor de moneda":
                String inputValue = JOptionPane.showInputDialog( "Ingrese la cantidad de dinero que deseas convertir" );
                break;
            case "Conversor de temperatura":
                break;

            default:
                throw new IllegalArgumentException( "Unexpected value: " + selectedValue );
        }
    }
}
