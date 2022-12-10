package currency_converter;

public class CurrencyConverter {
    // Estos valores debera obtenerse de consultar la data a través de una API
    private final double TRM_USD_COP = 4801.53;
    private final double TRM_EUR_COP = 5068.89;

    public double cop_to_usd ( double cop_value ) {
        double usd_value = cop_value / TRM_USD_COP;             // Realiza la conversion

        return (double) Math.round( usd_value * 100 ) / 100;    // Redondea a dos digitos
    }

    public double cop_to_eur ( double cop_value ) {
        double eur_value = cop_value / TRM_EUR_COP;             // Realiza la conversion

        return (double) Math.round( eur_value * 100 ) / 100;    // Redondea a dos digitos
    }
}
