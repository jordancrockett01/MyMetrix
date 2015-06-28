package baggins.frodo.metricconversion.unused.length;

import baggins.frodo.metricconversion.unused.IUnitObject;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class WorldLengthObject implements IUnitObject {
    private WorldLength worldUnit = null;
    private double length = 0;

    public WorldLengthObject(WorldLength unit, double length) {
        this.worldUnit = unit;
        this.length = length;
    }

    public WorldLength getUsUnit() {
        return worldUnit;
    }

    public double getLength() {
        return length;
    }
}
