package currency_converter;

import javax.swing.*;

public class ConverterUI {
    CurrencyConverter cc = new CurrencyConverter();
    String cop_value = null;

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

        this.continue_app();

    }

    public void continue_app() {
        Object[] options = { "Si", "No" };
        int option = JOptionPane.showOptionDialog(
            null,
            " ¿Desea continuar?",
            "Warning",
            JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
            null,
            options,
            options[ 0 ]
        );

        if( JOptionPane.OK_OPTION == option )
            this.main_menu();
        else
            JOptionPane.showMessageDialog(
                null,
                "Programa terminado"
            );
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

        this.cop_value = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir");

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
