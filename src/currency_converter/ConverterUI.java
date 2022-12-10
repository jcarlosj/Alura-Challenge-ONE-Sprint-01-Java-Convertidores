package currency_converter;

import javax.swing.*;

public class ConverterUI {
    CurrencyConverter cc = new CurrencyConverter();

    public void main_menu() {
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
                this.currency();

                break;
            case "Conversor de temperatura":
                break;

            default:
                throw new IllegalArgumentException( "Unexpected value: " + selectedValue );
        }
    }

    public void currency() {
        // Cuadro de diálogo - Opciones de Monedas
        String[] possibleValues = { "Seleccione...", "COP a USD", "COP a EUR" };
        String selectedValue = (String) JOptionPane.showInputDialog(
                null,
                "Elige la moneda a la que deseas convertir tu dinero",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibleValues,
                possibleValues[ 0 ]
        );

        String cop_value = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");

        switch ( selectedValue ) {
            case "COP a USD": {
                    double usd_value = cc.cop_to_usd(Double.parseDouble( cop_value ) );
                    JOptionPane.showMessageDialog(
                            null,
                            "Tienes $" + usd_value + " dólares", "Mensaje",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
                break;
            case "COP a EUR": {
                    double eur_value = cc.cop_to_usd( Double.parseDouble( cop_value ) );
                    JOptionPane.showMessageDialog(
                            null,
                            "Tienes $" + eur_value + " euros", "Mensaje",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
                break;
            default:
                throw new IllegalArgumentException( "Unexpected value: " + selectedValue );
        }
    }
}
