package currency_converter;

import javax.swing.*;

public class ConverterUI {
    CurrencyConverter cc = new CurrencyConverter();
    TemperatureConverter tc = new TemperatureConverter();
    String cop_value = null;
    String temp_value = null;

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
                this.temperature();
                break;

            default:
                throw new IllegalArgumentException( "Unexpected value: " + selectedValue );
        }

        this.continue_app();

    }

    private void temperature() {
        // Cuadro de diálogo - Opciones de Monedas
        String[] possibleValues = {
            "Seleccione...",
            "Farenheit a Celsius",
            "Celsius a Farenheit",
            "Farenheit a Kelvin",
            "Kelvin a Farenheit",
            "Kelvin a Celsius",
            "Celsius a Kelvin"
        };
        String selectedValue = (String) JOptionPane.showInputDialog(
                null,
                "Elige la conversión de temperatura que desees",
                "Menú",
                JOptionPane.QUESTION_MESSAGE,
                null,
                possibleValues,
                possibleValues[ 0 ]
        );

        this.temp_value = JOptionPane.showInputDialog( "Ingrese la temperatura" );

        if( ! isNumeric( this.temp_value ) ) {
            JOptionPane.showMessageDialog(
                null,
                "Valor no valido"
            );

            return;
        }

        switch ( selectedValue ) {
            case "Farenheit a Celsius": {
                double celsius_value = tc.farenheit_to_celsius( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºF son " + celsius_value + "ºC",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            case "Celsius a Farenheit": {
                double farenheit_value = tc.celsius_to_farenheit( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºC son " + farenheit_value + "ºF",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            case "Farenheit a Kelvin": {
                double kelvin_value = tc.farenheit_to_kelvin( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºF son " + kelvin_value + "ºK",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            case "Kelvin a Farenheit": {
                double farenheit_value = tc.kelvin_to_farenheit( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºK son " + farenheit_value + "ºF",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            case "Kelvin a Celsius": {
                double celsius_value = tc.kelvin_to_celsius( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºK son " + celsius_value + "ºC",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            case "Celsius a Kelvin": {
                double kelvin_value = tc.celsius_to_kelvin( Double.parseDouble( temp_value ) );
                JOptionPane.showMessageDialog(
                    null,
                    temp_value + "ºC son " + kelvin_value + "ºK",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            break;
            default:
                throw new IllegalArgumentException( "Unexpected value: " + selectedValue );
        }
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

        this.cop_value = JOptionPane.showInputDialog( "Ingrese la cantidad de dinero que deseas convertir" );

        if( ! isNumeric( this.cop_value ) ) {
            JOptionPane.showMessageDialog(
                null,
                "Valor no valido"
            );

            return;
        }

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

    public static boolean isNumeric( String strNum ) {
        if ( strNum == null )
            return false;

        try {
            double d = Double.parseDouble( strNum );
        } catch ( NumberFormatException nfe ) {
            return false;
        }

        return true;
    }
}
