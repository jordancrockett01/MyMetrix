package baggins.frodo.metricconversion.unused.temperature;

import baggins.frodo.metricconversion.activity.HomeActivity;
import baggins.frodo.metricconversion.unused.IConverter;
import baggins.frodo.metricconversion.unused.IUnit;
import baggins.frodo.metricconversion.unused.IUnitObject;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public class TempConverter implements IConverter {
    public TempConverter(HomeActivity activity) {

    }

    @Override
    public IUnitObject UsToWorld(IUnit fromUnit, double from, IUnit toUnit) {
        return UsToWorld(fromUnit, from, toUnit);
    }

    @Override
    public IUnitObject WorldToUs(IUnit fromUnit, double from, IUnit toUnit) {
        return WorldToUs(fromUnit, from, toUnit);
    }

    public WorldTempObject UsToWorld(UsTemp unit, double from, WorldTemp toUnit) {
        return null;
    }

    public UsTempObject WorldToUs(WorldTemp fromUnit, double from, UsTemp toUnit) {
        return null;
    }
}
