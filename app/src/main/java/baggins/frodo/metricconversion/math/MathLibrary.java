package baggins.frodo.metricconversion.math;

import android.util.Log;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class MathLibrary {
    public static final double INCHTOINCH = 1.0;
    public static final double INCHTOFOOT = 1.0/12.0;
    public static final double INCHTOYARD = 1.0/36.0;
    public static final double INCHTOMILE = 0.000015783;
    public static final double INCHTOMM = 25.4;
    public static final double INCHTOCM = 2.54;
    public static final double INCHTOMETER = 0.0254;
    public static final double INCHTOKM = 0.0000254;

    public static final double FOOTTOINCH = 12.0;
    public static final double FOOTTOFOOT = 1.0;
    public static final double FOOTTOYARD = 1.0/3.0;
    public static final double FOOTTOMILE = 0.000189394;
    public static final double FOOTTOMM = 304.8;
    public static final double FOOTTOCM = 30.48;
    public static final double FOOTTOMETER = 0.3048;
    public static final double FOOTTOKM = 0.0003048;

    public static final double YARDTOINCH = 36.0;
    public static final double YARDTOFOOT = 3.0;
    public static final double YARDTOYARD = 1.0;
    public static final double YARDTOMILE = 0.000568182;
    public static final double YARDTOMM = 914.4;
    public static final double YARDTOCM = 91.44;
    public static final double YARDTOMETER = 0.9144;
    public static final double YARDTOKM = 0.0009144;

    public static final double MILETOINCH = 63360.0;
    public static final double MILETOFOOT = 5280.0;
    public static final double MILETOYARD = 1760.0;
    public static final double MILETOMILE = 1.0;
    public static final double MILETOMM = 1609344;
    public static final double MILETOCM = 160934;
    public static final double MILETOMETER = 1609.34;
    public static final double MILETOKM = 1.60934;

    public static final double MMTOINCH = 1.0 / INCHTOMM;
    public static final double MMTOFOOT = 1.0 / FOOTTOMM;
    public static final double MMTOYARD = 1.0 / YARDTOMM;
    public static final double MMTOMILE = 1.0 / MILETOMM;
    public static final double MMTOMM = 1.0;
    public static final double MMTOCM = 0.1;
    public static final double MMTOMETER = 0.001;
    public static final double MMTOKM = 0.000001;

    public static final double CMTOINCH = 0.393701;
    public static final double CMTOFOOT = 1.0 / FOOTTOCM;
    public static final double CMTOYARD = 1.0 / YARDTOCM;
    public static final double CMTOMILE = 1.0 / MILETOCM;
    public static final double CMTOMM = 10.0;
    public static final double CMTOCM = 1.0;
    public static final double CMTOMETER = 0.01;
    public static final double CMTOKM = 0.00001;

    public static final double METERTOINCH = 1.0 / INCHTOMETER;
    public static final double METERTOFOOT = 1.0 / FOOTTOMETER;
    public static final double METERTOYARD = 1.0 / YARDTOMETER;
    public static final double METERTOMILE = 1.0 / MILETOMETER;
    public static final double METERTOMM = 1000;
    public static final double METERTOCM = 100;
    public static final double METERTOMETER = 1;
    public static final double METERTOKM = 0.001;

    public static final double KMTOINCH = 1.0 / INCHTOKM;
    public static final double KMTOFOOT = 1.0 / FOOTTOKM;
    public static final double KMTOYARD = 1.0 / YARDTOKM;
    public static final double KMTOMILE = 1.0 / MILETOKM;
    public static final double KMTOMM = 1000000;
    public static final double KMTOCM = 100000;
    public static final double KMTOMETER = 1000;
    public static final double KMTOKM = 1;

    public static final double FPSTOFPS = 1.0;
    public static final double FPSTOMPH = 0.6818181801556363;
    public static final double FPSTOMPS = 0.304799999536704;
    public static final double FPSTOKPH = 1.0972799983321344;

    public static final double MPHTOFPS = 1.4666666702429867;
    public static final double MPHTOMPH = 1.0;
    public static final double MPHTOMPS = 0.4470400004105615;
    public static final double MPHTOKPH = 1.6093440014780216;

    public static final double MPSTOFPS = 3.2808399;
    public static final double MPSTOMPH = 2.23693629 ;
    public static final double MPSTOMPS = 1.0;
    public static final double MPSTOKPH = 3.6;

    public static final double KPHTOFPS = 0.9113444166666667;
    public static final double KPHTOMPH = 0.6213711916666667;
    public static final double KPHTOMPS = 0.2777777777777778;
    public static final double KPHTOKPH = 1.0;


    public static double convert2(Metric metric, Unit fromUnit, Unit toUnit, double fromNum) {

        Log.d("convert2", metric + ", " + fromUnit + ", " + toUnit + ", " + fromNum);

        switch (metric) {
            case TEMPERATURE:
                return convertTemperature(fromUnit, toUnit, fromNum);
            case LENGTH:
                return convertLength(fromUnit, toUnit, fromNum);
            case SPEED:
                return convertSpeed(fromUnit, toUnit, fromNum);
            default:
                return 0;
        }
    }

    public static double fToF(double from) {
        return from;
    }

    public static double fToC(double from) {
        return (from - 32.0) * (5.0/9.0);
    }

    public static double fToK(double from) {
        return (from - 32.0) * (5.0/9.0) + 273.15;
    }

    public static double cToF(double from) {
        return (from * (9.0/5.0)) + 32;
    }

    public static double cToC(double from) {
        return from;
    }

    public static double cToK(double from) {
        return from + 273.15;
    }

    public static double kToF(double from) {
        return (from - 273.15) * (9.0/5.0) + 32;
    }

    public static double kToC(double from) {
        return from - 273.15;
    }

    public static double kToK(double from) {
        return from;
    }

    private static double convertTemperature(Unit fromUnit, Unit toUnit, double fromNum) {
        switch (fromUnit) {
            case Fahrenheit:
                switch (toUnit) {
                    case Fahrenheit:
                        return fToF(fromNum);
                    case Celsius:
                        return fToC(fromNum);
                    case Kelvin:
                        return fToK(fromNum);
                }
            case Celsius:
                switch (toUnit) {
                    case Fahrenheit:
                        return cToF(fromNum);
                    case Celsius:
                        return cToC(fromNum);
                    case Kelvin:
                        return cToK(fromNum);
                }
            case Kelvin:
                switch (toUnit) {
                    case Fahrenheit:
                        return kToF(fromNum);
                    case Celsius:
                        return kToC(fromNum);
                    case Kelvin:
                        return kToK(fromNum);
                }
            default:
                return 0;
        }
    }
    private static double convertLength(Unit fromUnit, Unit toUnit, double fromNum) {
        switch (fromUnit) {
            case Inch:
                switch (toUnit) {
                    case Inch:
                        return fromNum * INCHTOINCH;
                    case Foot:
                        return fromNum * INCHTOFOOT;
                    case Yard:
                        return fromNum * INCHTOYARD;
                    case Mile:
                        return fromNum * INCHTOMILE;
                    case Millimeter:
                        return fromNum * INCHTOMM;
                    case Centimeter:
                        return fromNum * INCHTOCM;
                    case Meter:
                        return fromNum * INCHTOMETER;
                    case Kilometer:
                        return fromNum * INCHTOKM;
                }
            case Foot:
                switch (toUnit) {
                    case Inch:
                        return fromNum * FOOTTOINCH;
                    case Foot:
                        return fromNum * FOOTTOFOOT;
                    case Yard:
                        return fromNum * FOOTTOYARD;
                    case Mile:
                        return fromNum * FOOTTOMILE;
                    case Millimeter:
                        return fromNum * FOOTTOMM;
                    case Centimeter:
                        return fromNum * FOOTTOCM;
                    case Meter:
                        return fromNum * FOOTTOMETER;
                    case Kilometer:
                        return fromNum * FOOTTOKM;
                }
            case Yard:
                switch (toUnit) {
                    case Inch:
                        return fromNum * YARDTOINCH;
                    case Foot:
                        return fromNum * YARDTOFOOT;
                    case Yard:
                        return fromNum * YARDTOYARD;
                    case Mile:
                        return fromNum * YARDTOMILE;
                    case Millimeter:
                        return fromNum * YARDTOMM;
                    case Centimeter:
                        return fromNum * YARDTOCM;
                    case Meter:
                        return fromNum * YARDTOMETER;
                    case Kilometer:
                        return fromNum * YARDTOKM;
                }
            case Mile:
                switch (toUnit) {
                    case Inch:
                        return fromNum * MILETOINCH;
                    case Foot:
                        return fromNum * MILETOFOOT;
                    case Yard:
                        return fromNum * MILETOYARD;
                    case Mile:
                        return fromNum * MILETOMILE;
                    case Millimeter:
                        return fromNum * MILETOMM;
                    case Centimeter:
                        return fromNum * MILETOCM;
                    case Meter:
                        return fromNum * MILETOMETER;
                    case Kilometer:
                        return fromNum * MILETOKM;
                }
            case Millimeter:
                switch (toUnit) {
                    case Inch:
                        return fromNum * MMTOINCH;
                    case Foot:
                        return fromNum * MMTOFOOT;
                    case Yard:
                        return fromNum * MMTOYARD;
                    case Mile:
                        return fromNum * MMTOMILE;
                    case Millimeter:
                        return fromNum * MMTOMM;
                    case Centimeter:
                        return fromNum * MMTOCM;
                    case Meter:
                        return fromNum * MMTOMETER;
                    case Kilometer:
                        return fromNum * MMTOKM;
                }
            case Centimeter:
                switch (toUnit) {
                    case Inch:
                        return fromNum * CMTOINCH;
                    case Foot:
                        return fromNum * CMTOFOOT;
                    case Yard:
                        return fromNum * CMTOYARD;
                    case Mile:
                        return fromNum * CMTOMILE;
                    case Millimeter:
                        return fromNum * CMTOMM;
                    case Centimeter:
                        return fromNum * CMTOCM;
                    case Meter:
                        return fromNum * CMTOMETER;
                    case Kilometer:
                        return fromNum * CMTOKM;
                }
            case Meter:
                switch (toUnit) {
                    case Inch:
                        return fromNum * METERTOINCH;
                    case Foot:
                        return fromNum * METERTOFOOT;
                    case Yard:
                        return fromNum * METERTOYARD;
                    case Mile:
                        return fromNum * METERTOMILE;
                    case Millimeter:
                        return fromNum * METERTOMM;
                    case Centimeter:
                        return fromNum * METERTOCM;
                    case Meter:
                        return fromNum * METERTOMETER;
                    case Kilometer:
                        return fromNum * METERTOKM;
                }
            case Kilometer:
                switch (toUnit) {
                    case Inch:
                        return fromNum * KMTOINCH;
                    case Foot:
                        return fromNum * KMTOFOOT;
                    case Yard:
                        return fromNum * KMTOYARD;
                    case Mile:
                        return fromNum * KMTOMILE;
                    case Millimeter:
                        return fromNum * KMTOMM;
                    case Centimeter:
                        return fromNum * KMTOCM;
                    case Meter:
                        return fromNum * KMTOMETER;
                    case Kilometer:
                        return fromNum * KMTOKM;
                }
            default:
                return 0;
        }
    }
    private static double convertSpeed(Unit fromUnit, Unit toUnit, double fromNum) {
        switch (fromUnit) {
            case MilesPerHour:
                switch (toUnit) {
                    case MilesPerHour:
                        return fromNum * MPHTOMPH;
                    case FeetPerSecond:
                        return fromNum * MPHTOFPS;
                    case KiloPerHour:
                        return fromNum * MPHTOKPH;
                    case MeterPerSecond:
                        return fromNum * MPHTOMPS;
                }
            case FeetPerSecond:
                switch (toUnit) {
                    case MilesPerHour:
                        return fromNum * FPSTOMPH;
                    case FeetPerSecond:
                        return fromNum * FPSTOFPS;
                    case KiloPerHour:
                        return fromNum * FPSTOKPH;
                    case MeterPerSecond:
                        return fromNum * FPSTOMPS;
                }
            case KiloPerHour:
                switch (toUnit) {
                    case MilesPerHour:
                        return fromNum * KPHTOMPH;
                    case FeetPerSecond:
                        return fromNum * KPHTOFPS;
                    case KiloPerHour:
                        return fromNum * KPHTOKPH;
                    case MeterPerSecond:
                        return fromNum * KPHTOMPS;
                }
            case MeterPerSecond:
                switch (toUnit) {
                    case MilesPerHour:
                        return fromNum * MPSTOMPH;
                    case FeetPerSecond:
                        return fromNum * MPSTOFPS;
                    case KiloPerHour:
                        return fromNum * MPSTOKPH;
                    case MeterPerSecond:
                        return fromNum * MPSTOMPS;
                }
        }
        return 0;
    }
}
