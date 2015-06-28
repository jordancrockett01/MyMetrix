package baggins.frodo.metricconversion.math;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public enum Unit {
    Inch("Inches"),
    Foot("Feet"),
    Yard("Yards"),
    Mile("Miles"),
    Millimeter("Millimeters"),
    Centimeter("Centimeters"),
    Meter("Meters"),
    Kilometer("Kilometers"),
    Unknown("Unknown"),
    Fahrenheit("Fahrenheit"),
    Celsius("Celsius"),
    Kelvin("Kelvin"),
    MilesPerHour("Miles/Hour"),
    FeetPerSecond("Feet/Second"),
    KiloPerHour("Km/Hour"),
    MeterPerSecond("Meter/Second");

    private String unit;

    Unit(String unit) {
        this.unit = unit;
    }

    public String getUnitString() {
        return unit;
    }

    public static Unit parse(String unit) {
        for (Unit u : values()) {
            if (u.unit.equals(unit)) {
                return u;
            }
        }
        return Unknown;
    }
}
