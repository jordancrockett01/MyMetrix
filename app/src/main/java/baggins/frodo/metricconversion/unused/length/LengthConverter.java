package baggins.frodo.metricconversion.unused.length;

import baggins.frodo.metricconversion.activity.HomeActivity;
import baggins.frodo.metricconversion.unused.IConverter;
import baggins.frodo.metricconversion.unused.IUnit;
import baggins.frodo.metricconversion.unused.IUnitObject;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class LengthConverter implements IConverter {

    public LengthConverter(HomeActivity activity) {

    }

    @Override
    public IUnitObject UsToWorld(IUnit fromUnit, double from, IUnit toUnit) {
        return UsToWorld(fromUnit, from, toUnit);
    }

    @Override
    public IUnitObject WorldToUs(IUnit fromUnit, double from, IUnit toUnit) {
        return WorldToUs(fromUnit, from, toUnit);
    }

    public WorldLengthObject UsToWorld(UsLength fromUnit, double from, WorldLength toUnit) {

        double inches = getInches(fromUnit, from);
        double cm = getCmFromInches(inches);
        return getWorldLengthFromCm(toUnit, cm);
    }

    public UsLengthObject WorldToUs(WorldLength fromUnit, double from, UsLength toUnit) {

        double cm = getCentimeters(fromUnit, from);
        double inches = getInchesFromCm(cm);
        return getUsLengthFromInches(toUnit, inches);
    }

    private double getCentimeters(WorldLength fromUnit, double from) {
        switch (fromUnit) {
            case MM:
                return from / 10.0;
            case CM:
                return from;
            case M:
                return from * 100;
            case KM:
                return from * 100000;
            default:
                return 0;
        }
    }

    public double getInchesFromCm(double cm) {
        return cm / 2.54;
    }

    public UsLengthObject getUsLengthFromInches(UsLength toUnit, double inches) {
        switch (toUnit) {
            case Inch:
                return new UsLengthObject(toUnit, inches);
            case Foot:
                double ft = inches / 12.0;
                return new UsLengthObject(toUnit, ft);
            case Yard:
                double yds = inches / 12.0 / 3;
                return new UsLengthObject(toUnit, yds);
            case Mile:
                double miles = inches / 63360.0;
                return new UsLengthObject(toUnit, miles);
            default:
                return null;
        }
    }

    private double getInches(UsLength fromUnit, double from) {
        switch (fromUnit) {
            case Inch:
                return from;
            case Foot:
                return from * 12;
            case Yard:
                return 3 * from * 12;
            case Mile:
                return from * 63360;
            default:
                return 0;
        }
    }

    private double getCmFromInches(double inches) {
        return inches * 2.54;
    }

    private WorldLengthObject getWorldLengthFromCm(WorldLength toUnit, double cm) {

        switch (toUnit) {
            case MM:
                double mm = cm * 10;
                return new WorldLengthObject(toUnit, mm);
            case CM:
                return new WorldLengthObject(toUnit, cm);
            case M:
                double m = cm / 100.0;
                return new WorldLengthObject(toUnit, m);
            case KM:
                double km = cm / 100000.0;
                return new WorldLengthObject(toUnit, km);
            default:
                return null;
        }
    }
}
