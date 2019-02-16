// Copyright: GEATEC engineering
// License: Apache 2

class Heater {
    public void setTemperature (float quantity, char unit) {
        switch (unit) {
            case 'C':
                setCelsius (quantity);
                break;
            case 'F':
                setFahrenheit (quantity); 
                break;
            default:    // Assume Kelvin
               temperature = quantity;
        }
    }
    public float getTemperature (char unit) {
        switch (unit) {
            case 'C':
                return getCelsius ();
            case 'F':
                return getFahrenheit ();
            default:    // Assume Kelvin
                return temperature;
        }
    }
    public String getTemperatureString (char unit) {
        return String.format ("%.2f %s", getTemperature (unit), unit);
    }
    private void setCelsius (float quantity) {
        this.temperature = quantity + celsiusTerm;
    }
    private float getCelsius () {
        return temperature - celsiusTerm;
    }
    
    private void setFahrenheit (float quantity) {
        setCelsius ((quantity - fahrenheitTerm) / fahrenheitFactor);
    }
    private float getFahrenheit () {
        return getCelsius () * fahrenheitFactor + fahrenheitTerm;
    }
    
    private float temperature = 0;  // Default always SI units, so Kelvin

    private static final float celsiusTerm = 273.15f;
    private static final float fahrenheitFactor = 9/5f;
    private static final float fahrenheitTerm = 32f;
}
