package baggins.frodo.metricconversion.unused.length;

import baggins.frodo.metricconversion.unused.IUnitObject;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class UsLengthObject implements IUnitObject {
    private UsLength usUnit = null;
    private double length = 0;

    public UsLengthObject(UsLength unit, double length) {
        this.usUnit = unit;
        this.length = length;
    }

    public UsLength getUsUnit() {
        return usUnit;
    }

    public double getLength() {
        return length;
    }
}
