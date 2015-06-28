package baggins.frodo.metricconversion.unused.speed;

import baggins.frodo.metricconversion.activity.HomeActivity;
import baggins.frodo.metricconversion.unused.IConverter;
import baggins.frodo.metricconversion.unused.IUnit;
import baggins.frodo.metricconversion.unused.IUnitObject;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class SpeedConverter implements IConverter {
    public SpeedConverter(HomeActivity activity) {

    }

    @Override
    public IUnitObject UsToWorld(IUnit fromUnit, double from, IUnit toUnit) {
        return UsToWorld(fromUnit, from, toUnit);
    }

    @Override
    public IUnitObject WorldToUs(IUnit fromUnit, double from, IUnit toUnit) {
        return WorldToUs(fromUnit, from, toUnit);
    }

    public WorldSpeedObject UsToWorld(UsSpeed unit, double from, WorldSpeed toUnit) {
        return null;
    }

    public UsSpeedObject WorldToUs(WorldSpeed fromUnit, double from, UsSpeed toUnit) {
        return null;
    }
}
