package currency_converter;

public class TemperatureConverter {
    public double farenheit_to_celsius( double farenheit ) {
        // ºC = (ºF-32) ÷ 1.8.
        double celsius = ( farenheit - 32 ) / 1.8;

        return (double) Math.round( celsius * 100 ) / 100;    // Redondea a dos digitos
    }

    public double celsius_to_farenheit( double celsius ) {
        // ºF = ºC x 1.8 + 32.
        double farenheit = celsius * 1.8 + 32;

        return (double) Math.round( farenheit * 100 ) / 100;    // Redondea a dos digitos
    }

    public double kelvin_to_celsius( double kelvin ) {
        // ºC = K – 273.15
        double celsius = kelvin - 273.15;

        return (double) Math.round( celsius * 100 ) / 100;    // Redondea a dos digitos
    }

    public double celsius_to_kelvin( double celsius ) {
        // ºC = K + 273.15
        double kelvin = celsius + 273.15;

        return (double) Math.round( kelvin * 100 ) / 100;    // Redondea a dos digitos
    }

    public double farenheit_to_kelvin( double farenheit ) {
        // K = 5/9 (ºF – 32) + 273.15
        double kelvin = ( 5 / 9 ) * ( farenheit - 32 ) + 273.15;

        return (double) Math.round( kelvin * 100 ) / 100;    // Redondea a dos digitos
    }

    public double kelvin_to_farenheit( double kelvin ) {
        // ºF = 1.8(K – 273.15) + 32.
        double farenheit = 1.8 * ( kelvin - 273.15 ) + 32;

        return (double) Math.round( farenheit * 100 ) / 100;    // Redondea a dos digitos
    }

}
